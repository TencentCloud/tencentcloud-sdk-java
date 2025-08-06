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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallRecordRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 访问密钥的ID
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * 调用源IP的ID
    */
    @SerializedName("SourceIPID")
    @Expose
    private Long SourceIPID;

    /**
    * 访问账号uin
    */
    @SerializedName("AccUin")
    @Expose
    private String AccUin;

    /**
    * 过滤器
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 访问密钥的ID 
     * @return AccessKeyID 访问密钥的ID
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set 访问密钥的ID
     * @param AccessKeyID 访问密钥的ID
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get 调用源IP的ID 
     * @return SourceIPID 调用源IP的ID
     */
    public Long getSourceIPID() {
        return this.SourceIPID;
    }

    /**
     * Set 调用源IP的ID
     * @param SourceIPID 调用源IP的ID
     */
    public void setSourceIPID(Long SourceIPID) {
        this.SourceIPID = SourceIPID;
    }

    /**
     * Get 访问账号uin 
     * @return AccUin 访问账号uin
     */
    public String getAccUin() {
        return this.AccUin;
    }

    /**
     * Set 访问账号uin
     * @param AccUin 访问账号uin
     */
    public void setAccUin(String AccUin) {
        this.AccUin = AccUin;
    }

    /**
     * Get 过滤器 
     * @return Filter 过滤器
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤器
     * @param Filter 过滤器
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeCallRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallRecordRequest(DescribeCallRecordRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.SourceIPID != null) {
            this.SourceIPID = new Long(source.SourceIPID);
        }
        if (source.AccUin != null) {
            this.AccUin = new String(source.AccUin);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "SourceIPID", this.SourceIPID);
        this.setParamSimple(map, prefix + "AccUin", this.AccUin);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

