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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosSecKeyInstanceResponse extends AbstractModel{

    /**
    * COS密钥对应的AppId
    */
    @SerializedName("CosAppid")
    @Expose
    private Long CosAppid;

    /**
    * COS密钥对应的存储桶名
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * 存储桶对应的地域
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * 密钥过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 密钥ID信息
    */
    @SerializedName("CosId")
    @Expose
    private String CosId;

    /**
    * 密钥KEY信息
    */
    @SerializedName("CosKey")
    @Expose
    private String CosKey;

    /**
    * 密钥TOCKEN信息
    */
    @SerializedName("CosTocken")
    @Expose
    private String CosTocken;

    /**
    * 密钥可访问的文件前缀人。例如：CosPrefix=test/123/666，则该密钥只能操作test/123/666为前缀的文件，例如test/123/666/1.txt
    */
    @SerializedName("CosPrefix")
    @Expose
    private String CosPrefix;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get COS密钥对应的AppId 
     * @return CosAppid COS密钥对应的AppId
     */
    public Long getCosAppid() {
        return this.CosAppid;
    }

    /**
     * Set COS密钥对应的AppId
     * @param CosAppid COS密钥对应的AppId
     */
    public void setCosAppid(Long CosAppid) {
        this.CosAppid = CosAppid;
    }

    /**
     * Get COS密钥对应的存储桶名 
     * @return CosBucket COS密钥对应的存储桶名
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set COS密钥对应的存储桶名
     * @param CosBucket COS密钥对应的存储桶名
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get 存储桶对应的地域 
     * @return CosRegion 存储桶对应的地域
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set 存储桶对应的地域
     * @param CosRegion 存储桶对应的地域
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get 密钥过期时间 
     * @return ExpireTime 密钥过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 密钥过期时间
     * @param ExpireTime 密钥过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 密钥ID信息 
     * @return CosId 密钥ID信息
     */
    public String getCosId() {
        return this.CosId;
    }

    /**
     * Set 密钥ID信息
     * @param CosId 密钥ID信息
     */
    public void setCosId(String CosId) {
        this.CosId = CosId;
    }

    /**
     * Get 密钥KEY信息 
     * @return CosKey 密钥KEY信息
     */
    public String getCosKey() {
        return this.CosKey;
    }

    /**
     * Set 密钥KEY信息
     * @param CosKey 密钥KEY信息
     */
    public void setCosKey(String CosKey) {
        this.CosKey = CosKey;
    }

    /**
     * Get 密钥TOCKEN信息 
     * @return CosTocken 密钥TOCKEN信息
     */
    public String getCosTocken() {
        return this.CosTocken;
    }

    /**
     * Set 密钥TOCKEN信息
     * @param CosTocken 密钥TOCKEN信息
     */
    public void setCosTocken(String CosTocken) {
        this.CosTocken = CosTocken;
    }

    /**
     * Get 密钥可访问的文件前缀人。例如：CosPrefix=test/123/666，则该密钥只能操作test/123/666为前缀的文件，例如test/123/666/1.txt 
     * @return CosPrefix 密钥可访问的文件前缀人。例如：CosPrefix=test/123/666，则该密钥只能操作test/123/666为前缀的文件，例如test/123/666/1.txt
     */
    public String getCosPrefix() {
        return this.CosPrefix;
    }

    /**
     * Set 密钥可访问的文件前缀人。例如：CosPrefix=test/123/666，则该密钥只能操作test/123/666为前缀的文件，例如test/123/666/1.txt
     * @param CosPrefix 密钥可访问的文件前缀人。例如：CosPrefix=test/123/666，则该密钥只能操作test/123/666为前缀的文件，例如test/123/666/1.txt
     */
    public void setCosPrefix(String CosPrefix) {
        this.CosPrefix = CosPrefix;
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
        this.setParamSimple(map, prefix + "CosAppid", this.CosAppid);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CosId", this.CosId);
        this.setParamSimple(map, prefix + "CosKey", this.CosKey);
        this.setParamSimple(map, prefix + "CosTocken", this.CosTocken);
        this.setParamSimple(map, prefix + "CosPrefix", this.CosPrefix);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

