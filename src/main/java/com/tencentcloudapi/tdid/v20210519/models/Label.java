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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Label extends AbstractModel{

    /**
    * 标签ID
    */
    @SerializedName("LabelId")
    @Expose
    private Long LabelId;

    /**
    * 标签名称
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * did数量
    */
    @SerializedName("DidCount")
    @Expose
    private Long DidCount;

    /**
    * 创建者did
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
     * Get 标签ID 
     * @return LabelId 标签ID
     */
    public Long getLabelId() {
        return this.LabelId;
    }

    /**
     * Set 标签ID
     * @param LabelId 标签ID
     */
    public void setLabelId(Long LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 标签名称 
     * @return LabelName 标签名称
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称
     * @param LabelName 标签名称
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get did数量 
     * @return DidCount did数量
     */
    public Long getDidCount() {
        return this.DidCount;
    }

    /**
     * Set did数量
     * @param DidCount did数量
     */
    public void setDidCount(Long DidCount) {
        this.DidCount = DidCount;
    }

    /**
     * Get 创建者did 
     * @return Did 创建者did
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set 创建者did
     * @param Did 创建者did
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 网络ID 
     * @return ClusterId 网络ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 网络ID
     * @param ClusterId 网络ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 群组ID 
     * @return GroupId 群组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 群组ID
     * @param GroupId 群组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.LabelId != null) {
            this.LabelId = new Long(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.DidCount != null) {
            this.DidCount = new Long(source.DidCount);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "DidCount", this.DidCount);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

