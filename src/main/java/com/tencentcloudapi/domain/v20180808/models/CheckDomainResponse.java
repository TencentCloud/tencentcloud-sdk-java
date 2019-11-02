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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDomainResponse  extends AbstractModel{

    /**
    * 所查询域名名称
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否能够注册
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * 不能注册原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 是否是溢价词
    */
    @SerializedName("Premium")
    @Expose
    private Boolean Premium;

    /**
    * 价格
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 是否是敏感词
    */
    @SerializedName("BlackWord")
    @Expose
    private Boolean BlackWord;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取所查询域名名称
     * @return DomainName 所查询域名名称
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置所查询域名名称
     * @param DomainName 所查询域名名称
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取是否能够注册
     * @return Available 是否能够注册
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * 设置是否能够注册
     * @param Available 是否能够注册
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * 获取不能注册原因
     * @return Reason 不能注册原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * 设置不能注册原因
     * @param Reason 不能注册原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * 获取是否是溢价词
     * @return Premium 是否是溢价词
     */
    public Boolean getPremium() {
        return this.Premium;
    }

    /**
     * 设置是否是溢价词
     * @param Premium 是否是溢价词
     */
    public void setPremium(Boolean Premium) {
        this.Premium = Premium;
    }

    /**
     * 获取价格
     * @return Price 价格
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * 设置价格
     * @param Price 价格
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * 获取是否是敏感词
     * @return BlackWord 是否是敏感词
     */
    public Boolean getBlackWord() {
        return this.BlackWord;
    }

    /**
     * 设置是否是敏感词
     * @param BlackWord 是否是敏感词
     */
    public void setBlackWord(Boolean BlackWord) {
        this.BlackWord = BlackWord;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Premium", this.Premium);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "BlackWord", this.BlackWord);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

