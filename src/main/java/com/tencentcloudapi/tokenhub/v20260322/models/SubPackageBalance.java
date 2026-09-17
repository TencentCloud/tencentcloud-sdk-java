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
    * <p>独占额度。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private String ExclusiveQuota;

    /**
    * <p>独占额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("ExclusiveUsed")
    @Expose
    private String ExclusiveUsed;

    /**
    * <p>独占额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("ExclusiveRemain")
    @Expose
    private String ExclusiveRemain;

    /**
    * <p>共享额度上限，-1 表示不限。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("SharedQuota")
    @Expose
    private String SharedQuota;

    /**
    * <p>共享额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("SharedUsed")
    @Expose
    private String SharedUsed;

    /**
    * <p>共享额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
    */
    @SerializedName("SharedRemain")
    @Expose
    private String SharedRemain;

    /**
    * <p>当前周期已用总量 exclusive_used + shared_used + overflow_used</p>
    */
    @SerializedName("TotalUsed")
    @Expose
    private String TotalUsed;

    /**
    * <p>API Key 额度包状态。取值：0（正常）、1（耗尽）。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>独占额度。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return ExclusiveQuota <p>独占额度。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public String getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set <p>独占额度。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param ExclusiveQuota <p>独占额度。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setExclusiveQuota(String ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get <p>独占额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return ExclusiveUsed <p>独占额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public String getExclusiveUsed() {
        return this.ExclusiveUsed;
    }

    /**
     * Set <p>独占额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param ExclusiveUsed <p>独占额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setExclusiveUsed(String ExclusiveUsed) {
        this.ExclusiveUsed = ExclusiveUsed;
    }

    /**
     * Get <p>独占额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return ExclusiveRemain <p>独占额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public String getExclusiveRemain() {
        return this.ExclusiveRemain;
    }

    /**
     * Set <p>独占额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param ExclusiveRemain <p>独占额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setExclusiveRemain(String ExclusiveRemain) {
        this.ExclusiveRemain = ExclusiveRemain;
    }

    /**
     * Get <p>共享额度上限，-1 表示不限。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return SharedQuota <p>共享额度上限，-1 表示不限。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public String getSharedQuota() {
        return this.SharedQuota;
    }

    /**
     * Set <p>共享额度上限，-1 表示不限。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param SharedQuota <p>共享额度上限，-1 表示不限。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setSharedQuota(String SharedQuota) {
        this.SharedQuota = SharedQuota;
    }

    /**
     * Get <p>共享额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return SharedUsed <p>共享额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public String getSharedUsed() {
        return this.SharedUsed;
    }

    /**
     * Set <p>共享额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param SharedUsed <p>共享额度已用量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setSharedUsed(String SharedUsed) {
        this.SharedUsed = SharedUsed;
    }

    /**
     * Get <p>共享额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul> 
     * @return SharedRemain <p>共享额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public String getSharedRemain() {
        return this.SharedRemain;
    }

    /**
     * Set <p>共享额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     * @param SharedRemain <p>共享额度剩余量。单位说明如下：</p><ul><li>套餐类型为专业套餐，单位取值为积分；</li><li>套餐类型为轻享套餐，单位取值为 token。</li></ul>
     */
    public void setSharedRemain(String SharedRemain) {
        this.SharedRemain = SharedRemain;
    }

    /**
     * Get <p>当前周期已用总量 exclusive_used + shared_used + overflow_used</p> 
     * @return TotalUsed <p>当前周期已用总量 exclusive_used + shared_used + overflow_used</p>
     */
    public String getTotalUsed() {
        return this.TotalUsed;
    }

    /**
     * Set <p>当前周期已用总量 exclusive_used + shared_used + overflow_used</p>
     * @param TotalUsed <p>当前周期已用总量 exclusive_used + shared_used + overflow_used</p>
     */
    public void setTotalUsed(String TotalUsed) {
        this.TotalUsed = TotalUsed;
    }

    /**
     * Get <p>API Key 额度包状态。取值：0（正常）、1（耗尽）。</p> 
     * @return Status <p>API Key 额度包状态。取值：0（正常）、1（耗尽）。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>API Key 额度包状态。取值：0（正常）、1（耗尽）。</p>
     * @param Status <p>API Key 额度包状态。取值：0（正常）、1（耗尽）。</p>
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
        if (source.TotalUsed != null) {
            this.TotalUsed = new String(source.TotalUsed);
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
        this.setParamSimple(map, prefix + "TotalUsed", this.TotalUsed);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

