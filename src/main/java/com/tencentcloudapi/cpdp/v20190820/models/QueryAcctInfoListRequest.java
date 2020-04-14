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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAcctInfoListRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 查询开始时间(以开户时间为准)
    */
    @SerializedName("QueryAcctBeginTime")
    @Expose
    private String QueryAcctBeginTime;

    /**
    * 查询结束时间(以开户时间为准)
    */
    @SerializedName("QueryAcctEndTime")
    @Expose
    private String QueryAcctEndTime;

    /**
    * 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
    */
    @SerializedName("PageOffset")
    @Expose
    private String PageOffset;

    /**
    * 由平台客服提供的计费密钥Id
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 计费签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 查询开始时间(以开户时间为准) 
     * @return QueryAcctBeginTime 查询开始时间(以开户时间为准)
     */
    public String getQueryAcctBeginTime() {
        return this.QueryAcctBeginTime;
    }

    /**
     * Set 查询开始时间(以开户时间为准)
     * @param QueryAcctBeginTime 查询开始时间(以开户时间为准)
     */
    public void setQueryAcctBeginTime(String QueryAcctBeginTime) {
        this.QueryAcctBeginTime = QueryAcctBeginTime;
    }

    /**
     * Get 查询结束时间(以开户时间为准) 
     * @return QueryAcctEndTime 查询结束时间(以开户时间为准)
     */
    public String getQueryAcctEndTime() {
        return this.QueryAcctEndTime;
    }

    /**
     * Set 查询结束时间(以开户时间为准)
     * @param QueryAcctEndTime 查询结束时间(以开户时间为准)
     */
    public void setQueryAcctEndTime(String QueryAcctEndTime) {
        this.QueryAcctEndTime = QueryAcctEndTime;
    }

    /**
     * Get 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后 
     * @return PageOffset 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
     */
    public String getPageOffset() {
        return this.PageOffset;
    }

    /**
     * Set 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
     * @param PageOffset 分页号,  起始值为1，每次最多返回20条记录，第二页返回的记录数为第21至40条记录，第三页为41至60条记录，顺序均按照开户时间的先后
     */
    public void setPageOffset(String PageOffset) {
        this.PageOffset = PageOffset;
    }

    /**
     * Get 由平台客服提供的计费密钥Id 
     * @return MidasSecretId 由平台客服提供的计费密钥Id
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 由平台客服提供的计费密钥Id
     * @param MidasSecretId 由平台客服提供的计费密钥Id
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 计费签名 
     * @return MidasSignature 计费签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 计费签名
     * @param MidasSignature 计费签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "QueryAcctBeginTime", this.QueryAcctBeginTime);
        this.setParamSimple(map, prefix + "QueryAcctEndTime", this.QueryAcctEndTime);
        this.setParamSimple(map, prefix + "PageOffset", this.PageOffset);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);

    }
}

