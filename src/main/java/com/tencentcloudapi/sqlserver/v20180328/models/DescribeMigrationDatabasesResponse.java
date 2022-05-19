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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationDatabasesResponse extends AbstractModel{

    /**
    * 数据库数量
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 数据库名称数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private String [] MigrateDBSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据库数量 
     * @return Amount 数据库数量
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 数据库数量
     * @param Amount 数据库数量
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 数据库名称数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrateDBSet 数据库名称数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * Set 数据库名称数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrateDBSet 数据库名称数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrateDBSet(String [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMigrationDatabasesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationDatabasesResponse(DescribeMigrationDatabasesResponse source) {
        if (source.Amount != null) {
            this.Amount = new Long(source.Amount);
        }
        if (source.MigrateDBSet != null) {
            this.MigrateDBSet = new String[source.MigrateDBSet.length];
            for (int i = 0; i < source.MigrateDBSet.length; i++) {
                this.MigrateDBSet[i] = new String(source.MigrateDBSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamArraySimple(map, prefix + "MigrateDBSet.", this.MigrateDBSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

