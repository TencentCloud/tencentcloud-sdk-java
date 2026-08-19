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

public class NotPassItemStatistic extends AbstractModel {

    /**
    * 策略类型。取值：SYSTEM（系统策略）、SELF（自定义策略）。
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略 ID。SYSTEM 策略为 0。
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * 父分类 ID。SELF 策略为 0。
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * 该策略下未通过的检测项数。
    */
    @SerializedName("NotPassCount")
    @Expose
    private Long NotPassCount;

    /**
    * 策略或分类名称。SYSTEM 取父分类名称，SELF 取策略名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 策略类型。取值：SYSTEM（系统策略）、SELF（自定义策略）。 
     * @return PolicyType 策略类型。取值：SYSTEM（系统策略）、SELF（自定义策略）。
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型。取值：SYSTEM（系统策略）、SELF（自定义策略）。
     * @param PolicyType 策略类型。取值：SYSTEM（系统策略）、SELF（自定义策略）。
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略 ID。SYSTEM 策略为 0。 
     * @return PolicyID 策略 ID。SYSTEM 策略为 0。
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set 策略 ID。SYSTEM 策略为 0。
     * @param PolicyID 策略 ID。SYSTEM 策略为 0。
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get 父分类 ID。SELF 策略为 0。 
     * @return ParentCategoryID 父分类 ID。SELF 策略为 0。
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set 父分类 ID。SELF 策略为 0。
     * @param ParentCategoryID 父分类 ID。SELF 策略为 0。
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get 该策略下未通过的检测项数。 
     * @return NotPassCount 该策略下未通过的检测项数。
     */
    public Long getNotPassCount() {
        return this.NotPassCount;
    }

    /**
     * Set 该策略下未通过的检测项数。
     * @param NotPassCount 该策略下未通过的检测项数。
     */
    public void setNotPassCount(Long NotPassCount) {
        this.NotPassCount = NotPassCount;
    }

    /**
     * Get 策略或分类名称。SYSTEM 取父分类名称，SELF 取策略名称。 
     * @return Name 策略或分类名称。SYSTEM 取父分类名称，SELF 取策略名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略或分类名称。SYSTEM 取父分类名称，SELF 取策略名称。
     * @param Name 策略或分类名称。SYSTEM 取父分类名称，SELF 取策略名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public NotPassItemStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotPassItemStatistic(NotPassItemStatistic source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.NotPassCount != null) {
            this.NotPassCount = new Long(source.NotPassCount);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "NotPassCount", this.NotPassCount);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

