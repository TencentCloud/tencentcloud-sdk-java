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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMemberTransactionDetailsResult extends AbstractModel{

    /**
    * 本次交易返回查询结果记录数。
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * 符合业务查询条件的记录总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 结束标志。
__0__：否
__1__：是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndFlag")
    @Expose
    private String EndFlag;

    /**
    * 会员间交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranItemArray")
    @Expose
    private MemberTransactionItem [] TranItemArray;

    /**
     * Get 本次交易返回查询结果记录数。 
     * @return ResultCount 本次交易返回查询结果记录数。
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set 本次交易返回查询结果记录数。
     * @param ResultCount 本次交易返回查询结果记录数。
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get 符合业务查询条件的记录总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 符合业务查询条件的记录总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合业务查询条件的记录总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 符合业务查询条件的记录总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 结束标志。
__0__：否
__1__：是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndFlag 结束标志。
__0__：否
__1__：是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndFlag() {
        return this.EndFlag;
    }

    /**
     * Set 结束标志。
__0__：否
__1__：是
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndFlag 结束标志。
__0__：否
__1__：是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndFlag(String EndFlag) {
        this.EndFlag = EndFlag;
    }

    /**
     * Get 会员间交易信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranItemArray 会员间交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberTransactionItem [] getTranItemArray() {
        return this.TranItemArray;
    }

    /**
     * Set 会员间交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranItemArray 会员间交易信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranItemArray(MemberTransactionItem [] TranItemArray) {
        this.TranItemArray = TranItemArray;
    }

    public QueryMemberTransactionDetailsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMemberTransactionDetailsResult(QueryMemberTransactionDetailsResult source) {
        if (source.ResultCount != null) {
            this.ResultCount = new Long(source.ResultCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.EndFlag != null) {
            this.EndFlag = new String(source.EndFlag);
        }
        if (source.TranItemArray != null) {
            this.TranItemArray = new MemberTransactionItem[source.TranItemArray.length];
            for (int i = 0; i < source.TranItemArray.length; i++) {
                this.TranItemArray[i] = new MemberTransactionItem(source.TranItemArray[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "EndFlag", this.EndFlag);
        this.setParamArrayObj(map, prefix + "TranItemArray.", this.TranItemArray);

    }
}

