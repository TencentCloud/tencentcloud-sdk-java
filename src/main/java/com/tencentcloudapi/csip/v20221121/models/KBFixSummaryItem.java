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

public class KBFixSummaryItem extends AbstractModel {

    /**
    * KB补丁ID
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
    * KB补丁名称
    */
    @SerializedName("KBName")
    @Expose
    private String KBName;

    /**
    * KB编号（如 KB5001234）
    */
    @SerializedName("KBNo")
    @Expose
    private String KBNo;

    /**
    * 关联漏洞数
    */
    @SerializedName("RelatedVulCount")
    @Expose
    private Long RelatedVulCount;

    /**
    * 受影响主机数
    */
    @SerializedName("AffectedCount")
    @Expose
    private Long AffectedCount;

    /**
    * 修复后是否需要重启系统
    */
    @SerializedName("NeedReboot")
    @Expose
    private Boolean NeedReboot;

    /**
    * 前置依赖补丁（逗号分隔的KB编号列表）
    */
    @SerializedName("KBPreCondition")
    @Expose
    private String KBPreCondition;

    /**
     * Get KB补丁ID 
     * @return KBId KB补丁ID
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set KB补丁ID
     * @param KBId KB补丁ID
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    /**
     * Get KB补丁名称 
     * @return KBName KB补丁名称
     */
    public String getKBName() {
        return this.KBName;
    }

    /**
     * Set KB补丁名称
     * @param KBName KB补丁名称
     */
    public void setKBName(String KBName) {
        this.KBName = KBName;
    }

    /**
     * Get KB编号（如 KB5001234） 
     * @return KBNo KB编号（如 KB5001234）
     */
    public String getKBNo() {
        return this.KBNo;
    }

    /**
     * Set KB编号（如 KB5001234）
     * @param KBNo KB编号（如 KB5001234）
     */
    public void setKBNo(String KBNo) {
        this.KBNo = KBNo;
    }

    /**
     * Get 关联漏洞数 
     * @return RelatedVulCount 关联漏洞数
     */
    public Long getRelatedVulCount() {
        return this.RelatedVulCount;
    }

    /**
     * Set 关联漏洞数
     * @param RelatedVulCount 关联漏洞数
     */
    public void setRelatedVulCount(Long RelatedVulCount) {
        this.RelatedVulCount = RelatedVulCount;
    }

    /**
     * Get 受影响主机数 
     * @return AffectedCount 受影响主机数
     */
    public Long getAffectedCount() {
        return this.AffectedCount;
    }

    /**
     * Set 受影响主机数
     * @param AffectedCount 受影响主机数
     */
    public void setAffectedCount(Long AffectedCount) {
        this.AffectedCount = AffectedCount;
    }

    /**
     * Get 修复后是否需要重启系统 
     * @return NeedReboot 修复后是否需要重启系统
     */
    public Boolean getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set 修复后是否需要重启系统
     * @param NeedReboot 修复后是否需要重启系统
     */
    public void setNeedReboot(Boolean NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get 前置依赖补丁（逗号分隔的KB编号列表） 
     * @return KBPreCondition 前置依赖补丁（逗号分隔的KB编号列表）
     */
    public String getKBPreCondition() {
        return this.KBPreCondition;
    }

    /**
     * Set 前置依赖补丁（逗号分隔的KB编号列表）
     * @param KBPreCondition 前置依赖补丁（逗号分隔的KB编号列表）
     */
    public void setKBPreCondition(String KBPreCondition) {
        this.KBPreCondition = KBPreCondition;
    }

    public KBFixSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBFixSummaryItem(KBFixSummaryItem source) {
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
        if (source.KBName != null) {
            this.KBName = new String(source.KBName);
        }
        if (source.KBNo != null) {
            this.KBNo = new String(source.KBNo);
        }
        if (source.RelatedVulCount != null) {
            this.RelatedVulCount = new Long(source.RelatedVulCount);
        }
        if (source.AffectedCount != null) {
            this.AffectedCount = new Long(source.AffectedCount);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Boolean(source.NeedReboot);
        }
        if (source.KBPreCondition != null) {
            this.KBPreCondition = new String(source.KBPreCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "KBName", this.KBName);
        this.setParamSimple(map, prefix + "KBNo", this.KBNo);
        this.setParamSimple(map, prefix + "RelatedVulCount", this.RelatedVulCount);
        this.setParamSimple(map, prefix + "AffectedCount", this.AffectedCount);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "KBPreCondition", this.KBPreCondition);

    }
}

