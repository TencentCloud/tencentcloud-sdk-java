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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsgRuleDetail extends AbstractModel {

    /**
    * 入站规则
    */
    @SerializedName("InBound")
    @Expose
    private UsgPolicy [] InBound;

    /**
    * 出站规则
    */
    @SerializedName("OutBound")
    @Expose
    private UsgPolicy [] OutBound;

    /**
    * 安全组Id
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 安全组名称
    */
    @SerializedName("SgName")
    @Expose
    private String SgName;

    /**
    * 备注
    */
    @SerializedName("SgRemark")
    @Expose
    private String SgRemark;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 版本
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
     * Get 入站规则 
     * @return InBound 入站规则
     */
    public UsgPolicy [] getInBound() {
        return this.InBound;
    }

    /**
     * Set 入站规则
     * @param InBound 入站规则
     */
    public void setInBound(UsgPolicy [] InBound) {
        this.InBound = InBound;
    }

    /**
     * Get 出站规则 
     * @return OutBound 出站规则
     */
    public UsgPolicy [] getOutBound() {
        return this.OutBound;
    }

    /**
     * Set 出站规则
     * @param OutBound 出站规则
     */
    public void setOutBound(UsgPolicy [] OutBound) {
        this.OutBound = OutBound;
    }

    /**
     * Get 安全组Id 
     * @return SgId 安全组Id
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set 安全组Id
     * @param SgId 安全组Id
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 安全组名称 
     * @return SgName 安全组名称
     */
    public String getSgName() {
        return this.SgName;
    }

    /**
     * Set 安全组名称
     * @param SgName 安全组名称
     */
    public void setSgName(String SgName) {
        this.SgName = SgName;
    }

    /**
     * Get 备注 
     * @return SgRemark 备注
     */
    public String getSgRemark() {
        return this.SgRemark;
    }

    /**
     * Set 备注
     * @param SgRemark 备注
     */
    public void setSgRemark(String SgRemark) {
        this.SgRemark = SgRemark;
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
     * Get 版本 
     * @return Version 版本
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 版本
     * @param Version 版本
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public UsgRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsgRuleDetail(UsgRuleDetail source) {
        if (source.InBound != null) {
            this.InBound = new UsgPolicy[source.InBound.length];
            for (int i = 0; i < source.InBound.length; i++) {
                this.InBound[i] = new UsgPolicy(source.InBound[i]);
            }
        }
        if (source.OutBound != null) {
            this.OutBound = new UsgPolicy[source.OutBound.length];
            for (int i = 0; i < source.OutBound.length; i++) {
                this.OutBound[i] = new UsgPolicy(source.OutBound[i]);
            }
        }
        if (source.SgId != null) {
            this.SgId = new String(source.SgId);
        }
        if (source.SgName != null) {
            this.SgName = new String(source.SgName);
        }
        if (source.SgRemark != null) {
            this.SgRemark = new String(source.SgRemark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InBound.", this.InBound);
        this.setParamArrayObj(map, prefix + "OutBound.", this.OutBound);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamSimple(map, prefix + "SgName", this.SgName);
        this.setParamSimple(map, prefix + "SgRemark", this.SgRemark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

