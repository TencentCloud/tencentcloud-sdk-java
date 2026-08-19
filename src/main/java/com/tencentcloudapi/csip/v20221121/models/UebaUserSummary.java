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

public class UebaUserSummary extends AbstractModel {

    /**
    * 全部用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllUserCount")
    @Expose
    private Long AllUserCount;

    /**
    * 异常用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbnormalUserCount")
    @Expose
    private Long AbnormalUserCount;

    /**
    * 云账号用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUserCount")
    @Expose
    private Long SubUserCount;

    /**
    * 自定义用户数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomUserCount")
    @Expose
    private Long CustomUserCount;

    /**
    * 自定义用户求和组成元素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Element")
    @Expose
    private UebaUserSummaryElement [] Element;

    /**
     * Get 全部用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllUserCount 全部用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllUserCount() {
        return this.AllUserCount;
    }

    /**
     * Set 全部用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllUserCount 全部用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllUserCount(Long AllUserCount) {
        this.AllUserCount = AllUserCount;
    }

    /**
     * Get 异常用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbnormalUserCount 异常用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAbnormalUserCount() {
        return this.AbnormalUserCount;
    }

    /**
     * Set 异常用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbnormalUserCount 异常用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormalUserCount(Long AbnormalUserCount) {
        this.AbnormalUserCount = AbnormalUserCount;
    }

    /**
     * Get 云账号用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserCount 云账号用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 云账号用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserCount 云账号用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get 子用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUserCount 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUserCount 子用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUserCount(Long SubUserCount) {
        this.SubUserCount = SubUserCount;
    }

    /**
     * Get 自定义用户数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomUserCount 自定义用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCustomUserCount() {
        return this.CustomUserCount;
    }

    /**
     * Set 自定义用户数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomUserCount 自定义用户数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomUserCount(Long CustomUserCount) {
        this.CustomUserCount = CustomUserCount;
    }

    /**
     * Get 自定义用户求和组成元素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Element 自定义用户求和组成元素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UebaUserSummaryElement [] getElement() {
        return this.Element;
    }

    /**
     * Set 自定义用户求和组成元素
注意：此字段可能返回 null，表示取不到有效值。
     * @param Element 自定义用户求和组成元素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElement(UebaUserSummaryElement [] Element) {
        this.Element = Element;
    }

    public UebaUserSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaUserSummary(UebaUserSummary source) {
        if (source.AllUserCount != null) {
            this.AllUserCount = new Long(source.AllUserCount);
        }
        if (source.AbnormalUserCount != null) {
            this.AbnormalUserCount = new Long(source.AbnormalUserCount);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.SubUserCount != null) {
            this.SubUserCount = new Long(source.SubUserCount);
        }
        if (source.CustomUserCount != null) {
            this.CustomUserCount = new Long(source.CustomUserCount);
        }
        if (source.Element != null) {
            this.Element = new UebaUserSummaryElement[source.Element.length];
            for (int i = 0; i < source.Element.length; i++) {
                this.Element[i] = new UebaUserSummaryElement(source.Element[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllUserCount", this.AllUserCount);
        this.setParamSimple(map, prefix + "AbnormalUserCount", this.AbnormalUserCount);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "SubUserCount", this.SubUserCount);
        this.setParamSimple(map, prefix + "CustomUserCount", this.CustomUserCount);
        this.setParamArrayObj(map, prefix + "Element.", this.Element);

    }
}

