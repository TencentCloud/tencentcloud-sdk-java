/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrowsingHistory extends AbstractModel {

    /**
    * 名字
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 访问时间
    */
    @SerializedName("VisitTime")
    @Expose
    private String VisitTime;

    /**
    * 资源相关个性化信息，json格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 资源id
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 查询历史的资源类型file/task/function/event等
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 名字 
     * @return Title 名字
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 名字
     * @param Title 名字
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 访问时间 
     * @return VisitTime 访问时间
     */
    public String getVisitTime() {
        return this.VisitTime;
    }

    /**
     * Set 访问时间
     * @param VisitTime 访问时间
     */
    public void setVisitTime(String VisitTime) {
        this.VisitTime = VisitTime;
    }

    /**
     * Get 资源相关个性化信息，json格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 资源相关个性化信息，json格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 资源相关个性化信息，json格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 资源相关个性化信息，json格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 资源id 
     * @return ResourceType 资源id
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源id
     * @param ResourceType 资源id
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 查询历史的资源类型file/task/function/event等 
     * @return ResourceId 查询历史的资源类型file/task/function/event等
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 查询历史的资源类型file/task/function/event等
     * @param ResourceId 查询历史的资源类型file/task/function/event等
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public BrowsingHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowsingHistory(BrowsingHistory source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.VisitTime != null) {
            this.VisitTime = new String(source.VisitTime);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "VisitTime", this.VisitTime);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

