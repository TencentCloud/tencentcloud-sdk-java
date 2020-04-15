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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectStateResponse extends AbstractModel{

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 身份证号码
    */
    @SerializedName("Idcard")
    @Expose
    private String Idcard;

    /**
    * 业务token
    */
    @SerializedName("BizToken")
    @Expose
    private String BizToken;

    /**
    * ulr地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 名字 
     * @return Name 名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
     * @param Name 名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 身份证号码 
     * @return Idcard 身份证号码
     */
    public String getIdcard() {
        return this.Idcard;
    }

    /**
     * Set 身份证号码
     * @param Idcard 身份证号码
     */
    public void setIdcard(String Idcard) {
        this.Idcard = Idcard;
    }

    /**
     * Get 业务token 
     * @return BizToken 业务token
     */
    public String getBizToken() {
        return this.BizToken;
    }

    /**
     * Set 业务token
     * @param BizToken 业务token
     */
    public void setBizToken(String BizToken) {
        this.BizToken = BizToken;
    }

    /**
     * Get ulr地址 
     * @return Url ulr地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set ulr地址
     * @param Url ulr地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Idcard", this.Idcard);
        this.setParamSimple(map, prefix + "BizToken", this.BizToken);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

