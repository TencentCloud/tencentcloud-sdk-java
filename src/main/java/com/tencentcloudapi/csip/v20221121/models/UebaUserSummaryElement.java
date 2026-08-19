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

public class UebaUserSummaryElement extends AbstractModel {

    /**
    * 成员id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberID")
    @Expose
    private String MemberID;

    /**
    * 日志类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 用户ID依据字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 成员id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberID 成员id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberID() {
        return this.MemberID;
    }

    /**
     * Set 成员id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberID 成员id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    /**
     * Get 日志类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogType 日志类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogType 日志类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 用户ID依据字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserID 用户ID依据字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set 用户ID依据字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserID 用户ID依据字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public UebaUserSummaryElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UebaUserSummaryElement(UebaUserSummaryElement source) {
        if (source.MemberID != null) {
            this.MemberID = new String(source.MemberID);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberID", this.MemberID);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

