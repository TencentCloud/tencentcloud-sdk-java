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

public class GetAuthorityIssuerResponse extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区块链网络id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 区块链群组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 权威机构did
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * 机构备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 注册时间
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * 认证时间
    */
    @SerializedName("RecognizeTime")
    @Expose
    private String RecognizeTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区块链网络id 
     * @return ClusterId 区块链网络id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 区块链网络id
     * @param ClusterId 区块链网络id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 区块链群组id 
     * @return GroupId 区块链群组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 区块链群组id
     * @param GroupId 区块链群组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 权威机构did 
     * @return Did 权威机构did
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set 权威机构did
     * @param Did 权威机构did
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get 机构备注信息 
     * @return Remark 机构备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 机构备注信息
     * @param Remark 机构备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 注册时间 
     * @return RegisterTime 注册时间
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 注册时间
     * @param RegisterTime 注册时间
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 认证时间 
     * @return RecognizeTime 认证时间
     */
    public String getRecognizeTime() {
        return this.RecognizeTime;
    }

    /**
     * Set 认证时间
     * @param RecognizeTime 认证时间
     */
    public void setRecognizeTime(String RecognizeTime) {
        this.RecognizeTime = RecognizeTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetAuthorityIssuerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAuthorityIssuerResponse(GetAuthorityIssuerResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RegisterTime != null) {
            this.RegisterTime = new String(source.RegisterTime);
        }
        if (source.RecognizeTime != null) {
            this.RecognizeTime = new String(source.RecognizeTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "RecognizeTime", this.RecognizeTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

