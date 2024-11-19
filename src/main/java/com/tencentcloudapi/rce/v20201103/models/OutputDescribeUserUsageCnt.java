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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDescribeUserUsageCnt extends AbstractModel {

    /**
    * 当前付费模式，0 后付费 1 预付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 后付费本月使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AfterPayModeThisMonthUsedCnt")
    @Expose
    private Long AfterPayModeThisMonthUsedCnt;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 超出时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 后付费上月使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AfterPayModeLastMonthUsedCnt")
    @Expose
    private Long AfterPayModeLastMonthUsedCnt;

    /**
    * 预付费总量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeforePayModeTotalUsedCnt")
    @Expose
    private Long BeforePayModeTotalUsedCnt;

    /**
    * 预付费剩余用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeforePayModeRemainUsedCnt")
    @Expose
    private Long BeforePayModeRemainUsedCnt;

    /**
     * Get 当前付费模式，0 后付费 1 预付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 当前付费模式，0 后付费 1 预付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 当前付费模式，0 后付费 1 预付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 当前付费模式，0 后付费 1 预付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 后付费本月使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AfterPayModeThisMonthUsedCnt 后付费本月使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAfterPayModeThisMonthUsedCnt() {
        return this.AfterPayModeThisMonthUsedCnt;
    }

    /**
     * Set 后付费本月使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AfterPayModeThisMonthUsedCnt 后付费本月使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAfterPayModeThisMonthUsedCnt(Long AfterPayModeThisMonthUsedCnt) {
        this.AfterPayModeThisMonthUsedCnt = AfterPayModeThisMonthUsedCnt;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 超出时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 超出时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 超出时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 超出时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 后付费上月使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AfterPayModeLastMonthUsedCnt 后付费上月使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAfterPayModeLastMonthUsedCnt() {
        return this.AfterPayModeLastMonthUsedCnt;
    }

    /**
     * Set 后付费上月使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AfterPayModeLastMonthUsedCnt 后付费上月使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAfterPayModeLastMonthUsedCnt(Long AfterPayModeLastMonthUsedCnt) {
        this.AfterPayModeLastMonthUsedCnt = AfterPayModeLastMonthUsedCnt;
    }

    /**
     * Get 预付费总量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeforePayModeTotalUsedCnt 预付费总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeforePayModeTotalUsedCnt() {
        return this.BeforePayModeTotalUsedCnt;
    }

    /**
     * Set 预付费总量
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeforePayModeTotalUsedCnt 预付费总量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeforePayModeTotalUsedCnt(Long BeforePayModeTotalUsedCnt) {
        this.BeforePayModeTotalUsedCnt = BeforePayModeTotalUsedCnt;
    }

    /**
     * Get 预付费剩余用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeforePayModeRemainUsedCnt 预付费剩余用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBeforePayModeRemainUsedCnt() {
        return this.BeforePayModeRemainUsedCnt;
    }

    /**
     * Set 预付费剩余用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeforePayModeRemainUsedCnt 预付费剩余用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeforePayModeRemainUsedCnt(Long BeforePayModeRemainUsedCnt) {
        this.BeforePayModeRemainUsedCnt = BeforePayModeRemainUsedCnt;
    }

    public OutputDescribeUserUsageCnt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputDescribeUserUsageCnt(OutputDescribeUserUsageCnt source) {
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AfterPayModeThisMonthUsedCnt != null) {
            this.AfterPayModeThisMonthUsedCnt = new Long(source.AfterPayModeThisMonthUsedCnt);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AfterPayModeLastMonthUsedCnt != null) {
            this.AfterPayModeLastMonthUsedCnt = new Long(source.AfterPayModeLastMonthUsedCnt);
        }
        if (source.BeforePayModeTotalUsedCnt != null) {
            this.BeforePayModeTotalUsedCnt = new Long(source.BeforePayModeTotalUsedCnt);
        }
        if (source.BeforePayModeRemainUsedCnt != null) {
            this.BeforePayModeRemainUsedCnt = new Long(source.BeforePayModeRemainUsedCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AfterPayModeThisMonthUsedCnt", this.AfterPayModeThisMonthUsedCnt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AfterPayModeLastMonthUsedCnt", this.AfterPayModeLastMonthUsedCnt);
        this.setParamSimple(map, prefix + "BeforePayModeTotalUsedCnt", this.BeforePayModeTotalUsedCnt);
        this.setParamSimple(map, prefix + "BeforePayModeRemainUsedCnt", this.BeforePayModeRemainUsedCnt);

    }
}

