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

public class DidData extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * did号码
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 权威机构认证状态 1未注册 2 未认证 3 已认证
    */
    @SerializedName("AuthorityState")
    @Expose
    private Long AuthorityState;

    /**
    * DID标签名称
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * DID创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 联盟名称
    */
    @SerializedName("AllianceName")
    @Expose
    private String AllianceName;

    /**
    * DID标签id
    */
    @SerializedName("LabelId")
    @Expose
    private Long LabelId;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
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

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get did号码 
     * @return Did did号码
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set did号码
     * @param Did did号码
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 权威机构认证状态 1未注册 2 未认证 3 已认证 
     * @return AuthorityState 权威机构认证状态 1未注册 2 未认证 3 已认证
     */
    public Long getAuthorityState() {
        return this.AuthorityState;
    }

    /**
     * Set 权威机构认证状态 1未注册 2 未认证 3 已认证
     * @param AuthorityState 权威机构认证状态 1未注册 2 未认证 3 已认证
     */
    public void setAuthorityState(Long AuthorityState) {
        this.AuthorityState = AuthorityState;
    }

    /**
     * Get DID标签名称 
     * @return LabelName DID标签名称
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set DID标签名称
     * @param LabelName DID标签名称
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get DID创建时间 
     * @return CreatedAt DID创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set DID创建时间
     * @param CreatedAt DID创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
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
     * Get 联盟名称 
     * @return AllianceName 联盟名称
     */
    public String getAllianceName() {
        return this.AllianceName;
    }

    /**
     * Set 联盟名称
     * @param AllianceName 联盟名称
     */
    public void setAllianceName(String AllianceName) {
        this.AllianceName = AllianceName;
    }

    /**
     * Get DID标签id 
     * @return LabelId DID标签id
     */
    public Long getLabelId() {
        return this.LabelId;
    }

    /**
     * Set DID标签id
     * @param LabelId DID标签id
     */
    public void setLabelId(Long LabelId) {
        this.LabelId = LabelId;
    }

    public DidData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidData(DidData source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AuthorityState != null) {
            this.AuthorityState = new Long(source.AuthorityState);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AllianceName != null) {
            this.AllianceName = new String(source.AllianceName);
        }
        if (source.LabelId != null) {
            this.LabelId = new Long(source.LabelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AuthorityState", this.AuthorityState);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AllianceName", this.AllianceName);
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);

    }
}

