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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigDataListPage extends AbstractModel{

    /**
    * 记录
    */
    @SerializedName("Records")
    @Expose
    private ConfigData [] Records;

    /**
    * 分页游标，用以查询下一页
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueToken")
    @Expose
    private String ContinueToken;

    /**
    * 剩余数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainingCount")
    @Expose
    private Long RemainingCount;

    /**
     * Get 记录 
     * @return Records 记录
     */
    public ConfigData [] getRecords() {
        return this.Records;
    }

    /**
     * Set 记录
     * @param Records 记录
     */
    public void setRecords(ConfigData [] Records) {
        this.Records = Records;
    }

    /**
     * Get 分页游标，用以查询下一页
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueToken 分页游标，用以查询下一页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContinueToken() {
        return this.ContinueToken;
    }

    /**
     * Set 分页游标，用以查询下一页
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueToken 分页游标，用以查询下一页
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueToken(String ContinueToken) {
        this.ContinueToken = ContinueToken;
    }

    /**
     * Get 剩余数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainingCount 剩余数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainingCount() {
        return this.RemainingCount;
    }

    /**
     * Set 剩余数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainingCount 剩余数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainingCount(Long RemainingCount) {
        this.RemainingCount = RemainingCount;
    }

    public DescribeConfigDataListPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigDataListPage(DescribeConfigDataListPage source) {
        if (source.Records != null) {
            this.Records = new ConfigData[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new ConfigData(source.Records[i]);
            }
        }
        if (source.ContinueToken != null) {
            this.ContinueToken = new String(source.ContinueToken);
        }
        if (source.RemainingCount != null) {
            this.RemainingCount = new Long(source.RemainingCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "ContinueToken", this.ContinueToken);
        this.setParamSimple(map, prefix + "RemainingCount", this.RemainingCount);

    }
}

