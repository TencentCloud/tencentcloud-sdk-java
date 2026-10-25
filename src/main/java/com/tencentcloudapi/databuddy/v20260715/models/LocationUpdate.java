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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocationUpdate extends AbstractModel {

    /**
    * 更新类型，取值：modify_location_name、modify_location_comment、modify_location_properties
    */
    @SerializedName("UpdateType")
    @Expose
    private String UpdateType;

    /**
    * 新的备注，可选，UpdateType 为 modify_location_comment 时使用
    */
    @SerializedName("NewComment")
    @Expose
    private String NewComment;

    /**
    * 新增/修改的属性键值对列表，可选，UpdateType 为 modify_location_properties 时使用
    */
    @SerializedName("SetProperties")
    @Expose
    private KVPair [] SetProperties;

    /**
    * 要移除的属性key列表，可选，UpdateType 为 modify_location_properties 时使用
    */
    @SerializedName("RemoveProperties")
    @Expose
    private String [] RemoveProperties;

    /**
    * 新的名称，可选，UpdateType 为 modify_location_name 时使用
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
     * Get 更新类型，取值：modify_location_name、modify_location_comment、modify_location_properties 
     * @return UpdateType 更新类型，取值：modify_location_name、modify_location_comment、modify_location_properties
     */
    public String getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新类型，取值：modify_location_name、modify_location_comment、modify_location_properties
     * @param UpdateType 更新类型，取值：modify_location_name、modify_location_comment、modify_location_properties
     */
    public void setUpdateType(String UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 新的备注，可选，UpdateType 为 modify_location_comment 时使用 
     * @return NewComment 新的备注，可选，UpdateType 为 modify_location_comment 时使用
     */
    public String getNewComment() {
        return this.NewComment;
    }

    /**
     * Set 新的备注，可选，UpdateType 为 modify_location_comment 时使用
     * @param NewComment 新的备注，可选，UpdateType 为 modify_location_comment 时使用
     */
    public void setNewComment(String NewComment) {
        this.NewComment = NewComment;
    }

    /**
     * Get 新增/修改的属性键值对列表，可选，UpdateType 为 modify_location_properties 时使用 
     * @return SetProperties 新增/修改的属性键值对列表，可选，UpdateType 为 modify_location_properties 时使用
     */
    public KVPair [] getSetProperties() {
        return this.SetProperties;
    }

    /**
     * Set 新增/修改的属性键值对列表，可选，UpdateType 为 modify_location_properties 时使用
     * @param SetProperties 新增/修改的属性键值对列表，可选，UpdateType 为 modify_location_properties 时使用
     */
    public void setSetProperties(KVPair [] SetProperties) {
        this.SetProperties = SetProperties;
    }

    /**
     * Get 要移除的属性key列表，可选，UpdateType 为 modify_location_properties 时使用 
     * @return RemoveProperties 要移除的属性key列表，可选，UpdateType 为 modify_location_properties 时使用
     */
    public String [] getRemoveProperties() {
        return this.RemoveProperties;
    }

    /**
     * Set 要移除的属性key列表，可选，UpdateType 为 modify_location_properties 时使用
     * @param RemoveProperties 要移除的属性key列表，可选，UpdateType 为 modify_location_properties 时使用
     */
    public void setRemoveProperties(String [] RemoveProperties) {
        this.RemoveProperties = RemoveProperties;
    }

    /**
     * Get 新的名称，可选，UpdateType 为 modify_location_name 时使用 
     * @return NewName 新的名称，可选，UpdateType 为 modify_location_name 时使用
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set 新的名称，可选，UpdateType 为 modify_location_name 时使用
     * @param NewName 新的名称，可选，UpdateType 为 modify_location_name 时使用
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    public LocationUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocationUpdate(LocationUpdate source) {
        if (source.UpdateType != null) {
            this.UpdateType = new String(source.UpdateType);
        }
        if (source.NewComment != null) {
            this.NewComment = new String(source.NewComment);
        }
        if (source.SetProperties != null) {
            this.SetProperties = new KVPair[source.SetProperties.length];
            for (int i = 0; i < source.SetProperties.length; i++) {
                this.SetProperties[i] = new KVPair(source.SetProperties[i]);
            }
        }
        if (source.RemoveProperties != null) {
            this.RemoveProperties = new String[source.RemoveProperties.length];
            for (int i = 0; i < source.RemoveProperties.length; i++) {
                this.RemoveProperties[i] = new String(source.RemoveProperties[i]);
            }
        }
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "NewComment", this.NewComment);
        this.setParamArrayObj(map, prefix + "SetProperties.", this.SetProperties);
        this.setParamArraySimple(map, prefix + "RemoveProperties.", this.RemoveProperties);
        this.setParamSimple(map, prefix + "NewName", this.NewName);

    }
}

