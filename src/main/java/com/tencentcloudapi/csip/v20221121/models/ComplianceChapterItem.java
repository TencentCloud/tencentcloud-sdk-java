/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceChapterItem extends AbstractModel {

    /**
    * <p>菜单ID</p>
    */
    @SerializedName("MenuID")
    @Expose
    private String MenuID;

    /**
    * <p>条款分类名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>条款对应章节</p>
    */
    @SerializedName("Terms")
    @Expose
    private ComplianceTermItem [] Terms;

    /**
     * Get <p>菜单ID</p> 
     * @return MenuID <p>菜单ID</p>
     */
    public String getMenuID() {
        return this.MenuID;
    }

    /**
     * Set <p>菜单ID</p>
     * @param MenuID <p>菜单ID</p>
     */
    public void setMenuID(String MenuID) {
        this.MenuID = MenuID;
    }

    /**
     * Get <p>条款分类名称</p> 
     * @return Name <p>条款分类名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>条款分类名称</p>
     * @param Name <p>条款分类名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>条款对应章节</p> 
     * @return Terms <p>条款对应章节</p>
     */
    public ComplianceTermItem [] getTerms() {
        return this.Terms;
    }

    /**
     * Set <p>条款对应章节</p>
     * @param Terms <p>条款对应章节</p>
     */
    public void setTerms(ComplianceTermItem [] Terms) {
        this.Terms = Terms;
    }

    public ComplianceChapterItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceChapterItem(ComplianceChapterItem source) {
        if (source.MenuID != null) {
            this.MenuID = new String(source.MenuID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Terms != null) {
            this.Terms = new ComplianceTermItem[source.Terms.length];
            for (int i = 0; i < source.Terms.length; i++) {
                this.Terms[i] = new ComplianceTermItem(source.Terms[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MenuID", this.MenuID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Terms.", this.Terms);

    }
}

