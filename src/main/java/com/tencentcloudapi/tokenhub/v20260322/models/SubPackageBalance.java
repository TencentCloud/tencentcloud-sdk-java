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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubPackageBalance extends AbstractModel {

    /**
    * 独占额度。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private String ExclusiveQuota;

    /**
    * 独占额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("ExclusiveUsed")
    @Expose
    private String ExclusiveUsed;

    /**
    * 独占额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("ExclusiveRemain")
    @Expose
    private String ExclusiveRemain;

    /**
    * 共享额度上限，-1 表示不限。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("SharedQuota")
    @Expose
    private String SharedQuota;

    /**
    * 共享额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("SharedUsed")
    @Expose
    private String SharedUsed;

    /**
    * 共享额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
    */
    @SerializedName("SharedRemain")
    @Expose
    private String SharedRemain;

    /**
    * API Key 额度包状态。取值：0（正常）、1（耗尽）。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 独占额度。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return ExclusiveQuota 独占额度。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public String getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set 独占额度。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param ExclusiveQuota 独占额度。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setExclusiveQuota(String ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get 独占额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return ExclusiveUsed 独占额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public String getExclusiveUsed() {
        return this.ExclusiveUsed;
    }

    /**
     * Set 独占额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param ExclusiveUsed 独占额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setExclusiveUsed(String ExclusiveUsed) {
        this.ExclusiveUsed = ExclusiveUsed;
    }

    /**
     * Get 独占额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return ExclusiveRemain 独占额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public String getExclusiveRemain() {
        return this.ExclusiveRemain;
    }

    /**
     * Set 独占额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param ExclusiveRemain 独占额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setExclusiveRemain(String ExclusiveRemain) {
        this.ExclusiveRemain = ExclusiveRemain;
    }

    /**
     * Get 共享额度上限，-1 表示不限。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return SharedQuota 共享额度上限，-1 表示不限。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public String getSharedQuota() {
        return this.SharedQuota;
    }

    /**
     * Set 共享额度上限，-1 表示不限。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param SharedQuota 共享额度上限，-1 表示不限。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setSharedQuota(String SharedQuota) {
        this.SharedQuota = SharedQuota;
    }

    /**
     * Get 共享额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return SharedUsed 共享额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public String getSharedUsed() {
        return this.SharedUsed;
    }

    /**
     * Set 共享额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param SharedUsed 共享额度已用量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setSharedUsed(String SharedUsed) {
        this.SharedUsed = SharedUsed;
    }

    /**
     * Get 共享额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。 
     * @return SharedRemain 共享额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public String getSharedRemain() {
        return this.SharedRemain;
    }

    /**
     * Set 共享额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     * @param SharedRemain 共享额度剩余量。单位说明如下：
- 套餐类型为专业套餐，单位取值为积分；
- 套餐类型为轻享套餐，单位取值为 token。
     */
    public void setSharedRemain(String SharedRemain) {
        this.SharedRemain = SharedRemain;
    }

    /**
     * Get API Key 额度包状态。取值：0（正常）、1（耗尽）。 
     * @return Status API Key 额度包状态。取值：0（正常）、1（耗尽）。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API Key 额度包状态。取值：0（正常）、1（耗尽）。
     * @param Status API Key 额度包状态。取值：0（正常）、1（耗尽）。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SubPackageBalance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubPackageBalance(SubPackageBalance source) {
        if (source.ExclusiveQuota != null) {
            this.ExclusiveQuota = new String(source.ExclusiveQuota);
        }
        if (source.ExclusiveUsed != null) {
            this.ExclusiveUsed = new String(source.ExclusiveUsed);
        }
        if (source.ExclusiveRemain != null) {
            this.ExclusiveRemain = new String(source.ExclusiveRemain);
        }
        if (source.SharedQuota != null) {
            this.SharedQuota = new String(source.SharedQuota);
        }
        if (source.SharedUsed != null) {
            this.SharedUsed = new String(source.SharedUsed);
        }
        if (source.SharedRemain != null) {
            this.SharedRemain = new String(source.SharedRemain);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExclusiveQuota", this.ExclusiveQuota);
        this.setParamSimple(map, prefix + "ExclusiveUsed", this.ExclusiveUsed);
        this.setParamSimple(map, prefix + "ExclusiveRemain", this.ExclusiveRemain);
        this.setParamSimple(map, prefix + "SharedQuota", this.SharedQuota);
        this.setParamSimple(map, prefix + "SharedUsed", this.SharedUsed);
        this.setParamSimple(map, prefix + "SharedRemain", this.SharedRemain);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

