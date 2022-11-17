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

public class GetDidDetailResponse extends AbstractModel{

    /**
    * DID名称
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
    * 公钥
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 权威认证
    */
    @SerializedName("AuthorityState")
    @Expose
    private Long AuthorityState;

    /**
    * 联盟ID
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * 联盟名称
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

    /**
    * 群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 网络ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * bcos资源ID
    */
    @SerializedName("ResChainId")
    @Expose
    private String ResChainId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DID名称 
     * @return Did DID名称
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set DID名称
     * @param Did DID名称
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
     * Get 公钥 
     * @return PublicKey 公钥
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥
     * @param PublicKey 公钥
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 权威认证 
     * @return AuthorityState 权威认证
     */
    public Long getAuthorityState() {
        return this.AuthorityState;
    }

    /**
     * Set 权威认证
     * @param AuthorityState 权威认证
     */
    public void setAuthorityState(Long AuthorityState) {
        this.AuthorityState = AuthorityState;
    }

    /**
     * Get 联盟ID 
     * @return ConsortiumId 联盟ID
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set 联盟ID
     * @param ConsortiumId 联盟ID
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get 联盟名称 
     * @return ConsortiumName 联盟名称
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set 联盟名称
     * @param ConsortiumName 联盟名称
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
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
     * Get bcos资源ID 
     * @return ResChainId bcos资源ID
     */
    public String getResChainId() {
        return this.ResChainId;
    }

    /**
     * Set bcos资源ID
     * @param ResChainId bcos资源ID
     */
    public void setResChainId(String ResChainId) {
        this.ResChainId = ResChainId;
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

    public GetDidDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDidDetailResponse(GetDidDetailResponse source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.AuthorityState != null) {
            this.AuthorityState = new Long(source.AuthorityState);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResChainId != null) {
            this.ResChainId = new String(source.ResChainId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "AuthorityState", this.AuthorityState);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ResChainId", this.ResChainId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

