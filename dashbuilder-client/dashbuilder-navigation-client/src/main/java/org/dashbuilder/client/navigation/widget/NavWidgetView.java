/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dashbuilder.client.navigation.widget;

import com.google.gwt.user.client.ui.IsWidget;
import org.uberfire.client.mvp.UberView;
import org.uberfire.mvp.Command;

public interface NavWidgetView<T> extends UberView<T> {

    void clearItems();

    void addGroupItem(String id, String name, String description, IsWidget widget);

    void addItem(String id, String name, String description, Command onItemSelected);

    void addDivider();

    void setActive(boolean active);

    void setSelectedItem(String id);

    void clearSelectedItem();

    void errorNavItemNotFound(String navItemId);

    void errorNavItemsEmpty();
}
