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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackListData extends AbstractModel{

    /**
    * 黑名单类型，01代表手机号码。
    */
    @SerializedName("BlackType")
    @Expose
    private String BlackType;

    /**
    * 操作类型，A为新增，D为删除。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperType")
    @Expose
    private String OperType;

    /**
    * 黑名单值，BlackType为01时，填写11位手机号码。
    */
    @SerializedName("BlackValue")
    @Expose
    private String BlackValue;

    /**
    * 备注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlackDescription")
    @Expose
    private String BlackDescription;

    /**
    * 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlackValidDate")
    @Expose
    private String BlackValidDate;

    /**
    * 黑名单加入日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlackAddDate")
    @Expose
    private String BlackAddDate;

    /**
    * 0-生效 1-失效
    */
    @SerializedName("BlackStatus")
    @Expose
    private String BlackStatus;

    /**
     * Get 黑名单类型，01代表手机号码。 
     * @return BlackType 黑名单类型，01代表手机号码。
     */
    public String getBlackType() {
        return this.BlackType;
    }

    /**
     * Set 黑名单类型，01代表手机号码。
     * @param BlackType 黑名单类型，01代表手机号码。
     */
    public void setBlackType(String BlackType) {
        this.BlackType = BlackType;
    }

    /**
     * Get 操作类型，A为新增，D为删除。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperType 操作类型，A为新增，D为删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperType() {
        return this.OperType;
    }

    /**
     * Set 操作类型，A为新增，D为删除。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperType 操作类型，A为新增，D为删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperType(String OperType) {
        this.OperType = OperType;
    }

    /**
     * Get 黑名单值，BlackType为01时，填写11位手机号码。 
     * @return BlackValue 黑名单值，BlackType为01时，填写11位手机号码。
     */
    public String getBlackValue() {
        return this.BlackValue;
    }

    /**
     * Set 黑名单值，BlackType为01时，填写11位手机号码。
     * @param BlackValue 黑名单值，BlackType为01时，填写11位手机号码。
     */
    public void setBlackValue(String BlackValue) {
        this.BlackValue = BlackValue;
    }

    /**
     * Get 备注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlackDescription 备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlackDescription() {
        return this.BlackDescription;
    }

    /**
     * Set 备注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlackDescription 备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlackDescription(String BlackDescription) {
        this.BlackDescription = BlackDescription;
    }

    /**
     * Get 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlackValidDate 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlackValidDate() {
        return this.BlackValidDate;
    }

    /**
     * Set 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlackValidDate 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlackValidDate(String BlackValidDate) {
        this.BlackValidDate = BlackValidDate;
    }

    /**
     * Get 黑名单加入日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlackAddDate 黑名单加入日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlackAddDate() {
        return this.BlackAddDate;
    }

    /**
     * Set 黑名单加入日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlackAddDate 黑名单加入日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlackAddDate(String BlackAddDate) {
        this.BlackAddDate = BlackAddDate;
    }

    /**
     * Get 0-生效 1-失效 
     * @return BlackStatus 0-生效 1-失效
     */
    public String getBlackStatus() {
        return this.BlackStatus;
    }

    /**
     * Set 0-生效 1-失效
     * @param BlackStatus 0-生效 1-失效
     */
    public void setBlackStatus(String BlackStatus) {
        this.BlackStatus = BlackStatus;
    }

    public BlackListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackListData(BlackListData source) {
        if (source.BlackType != null) {
            this.BlackType = new String(source.BlackType);
        }
        if (source.OperType != null) {
            this.OperType = new String(source.OperType);
        }
        if (source.BlackValue != null) {
            this.BlackValue = new String(source.BlackValue);
        }
        if (source.BlackDescription != null) {
            this.BlackDescription = new String(source.BlackDescription);
        }
        if (source.BlackValidDate != null) {
            this.BlackValidDate = new String(source.BlackValidDate);
        }
        if (source.BlackAddDate != null) {
            this.BlackAddDate = new String(source.BlackAddDate);
        }
        if (source.BlackStatus != null) {
            this.BlackStatus = new String(source.BlackStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlackType", this.BlackType);
        this.setParamSimple(map, prefix + "OperType", this.OperType);
        this.setParamSimple(map, prefix + "BlackValue", this.BlackValue);
        this.setParamSimple(map, prefix + "BlackDescription", this.BlackDescription);
        this.setParamSimple(map, prefix + "BlackValidDate", this.BlackValidDate);
        this.setParamSimple(map, prefix + "BlackAddDate", this.BlackAddDate);
        this.setParamSimple(map, prefix + "BlackStatus", this.BlackStatus);

    }
}

