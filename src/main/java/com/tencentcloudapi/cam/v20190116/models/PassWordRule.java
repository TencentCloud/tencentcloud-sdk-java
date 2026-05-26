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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassWordRule extends AbstractModel {

    /**
    * 最小长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinimumLength")
    @Expose
    private Long MinimumLength;

    /**
    * 必须包含的字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MustContain")
    @Expose
    private String MustContain;

    /**
    * 强制修改周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForcePasswordChange")
    @Expose
    private Long ForcePasswordChange;

    /**
    * 重复使用次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReusePasswordLimit")
    @Expose
    private Long ReusePasswordLimit;

    /**
    * 密码重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryPasswordLimit")
    @Expose
    private Long RetryPasswordLimit;

    /**
    * 密码过期失效 1：是，2：否（是：密码过期后，子用户无法登录，需要管理员重置密码。否：密码过期后，子用户可登录，登录后强制根据旧密码修改密码）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PasswordExpirationInvalidation")
    @Expose
    private Long PasswordExpirationInvalidation;

    /**
     * Get 最小长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinimumLength 最小长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinimumLength() {
        return this.MinimumLength;
    }

    /**
     * Set 最小长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinimumLength 最小长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinimumLength(Long MinimumLength) {
        this.MinimumLength = MinimumLength;
    }

    /**
     * Get 必须包含的字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MustContain 必须包含的字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMustContain() {
        return this.MustContain;
    }

    /**
     * Set 必须包含的字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param MustContain 必须包含的字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMustContain(String MustContain) {
        this.MustContain = MustContain;
    }

    /**
     * Get 强制修改周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForcePasswordChange 强制修改周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getForcePasswordChange() {
        return this.ForcePasswordChange;
    }

    /**
     * Set 强制修改周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForcePasswordChange 强制修改周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForcePasswordChange(Long ForcePasswordChange) {
        this.ForcePasswordChange = ForcePasswordChange;
    }

    /**
     * Get 重复使用次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReusePasswordLimit 重复使用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReusePasswordLimit() {
        return this.ReusePasswordLimit;
    }

    /**
     * Set 重复使用次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReusePasswordLimit 重复使用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReusePasswordLimit(Long ReusePasswordLimit) {
        this.ReusePasswordLimit = ReusePasswordLimit;
    }

    /**
     * Get 密码重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryPasswordLimit 密码重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryPasswordLimit() {
        return this.RetryPasswordLimit;
    }

    /**
     * Set 密码重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryPasswordLimit 密码重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryPasswordLimit(Long RetryPasswordLimit) {
        this.RetryPasswordLimit = RetryPasswordLimit;
    }

    /**
     * Get 密码过期失效 1：是，2：否（是：密码过期后，子用户无法登录，需要管理员重置密码。否：密码过期后，子用户可登录，登录后强制根据旧密码修改密码）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PasswordExpirationInvalidation 密码过期失效 1：是，2：否（是：密码过期后，子用户无法登录，需要管理员重置密码。否：密码过期后，子用户可登录，登录后强制根据旧密码修改密码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPasswordExpirationInvalidation() {
        return this.PasswordExpirationInvalidation;
    }

    /**
     * Set 密码过期失效 1：是，2：否（是：密码过期后，子用户无法登录，需要管理员重置密码。否：密码过期后，子用户可登录，登录后强制根据旧密码修改密码）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PasswordExpirationInvalidation 密码过期失效 1：是，2：否（是：密码过期后，子用户无法登录，需要管理员重置密码。否：密码过期后，子用户可登录，登录后强制根据旧密码修改密码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPasswordExpirationInvalidation(Long PasswordExpirationInvalidation) {
        this.PasswordExpirationInvalidation = PasswordExpirationInvalidation;
    }

    public PassWordRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PassWordRule(PassWordRule source) {
        if (source.MinimumLength != null) {
            this.MinimumLength = new Long(source.MinimumLength);
        }
        if (source.MustContain != null) {
            this.MustContain = new String(source.MustContain);
        }
        if (source.ForcePasswordChange != null) {
            this.ForcePasswordChange = new Long(source.ForcePasswordChange);
        }
        if (source.ReusePasswordLimit != null) {
            this.ReusePasswordLimit = new Long(source.ReusePasswordLimit);
        }
        if (source.RetryPasswordLimit != null) {
            this.RetryPasswordLimit = new Long(source.RetryPasswordLimit);
        }
        if (source.PasswordExpirationInvalidation != null) {
            this.PasswordExpirationInvalidation = new Long(source.PasswordExpirationInvalidation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinimumLength", this.MinimumLength);
        this.setParamSimple(map, prefix + "MustContain", this.MustContain);
        this.setParamSimple(map, prefix + "ForcePasswordChange", this.ForcePasswordChange);
        this.setParamSimple(map, prefix + "ReusePasswordLimit", this.ReusePasswordLimit);
        this.setParamSimple(map, prefix + "RetryPasswordLimit", this.RetryPasswordLimit);
        this.setParamSimple(map, prefix + "PasswordExpirationInvalidation", this.PasswordExpirationInvalidation);

    }
}

