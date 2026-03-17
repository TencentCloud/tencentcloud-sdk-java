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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLineageColumnsResponse extends AbstractModel {

    /**
    * 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreType")
    @Expose
    private String [] MetastoreType;

    /**
    * 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreTypeName")
    @Expose
    private String MetastoreTypeName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnSet")
    @Expose
    private ColumnLineageInfo [] ColumnSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 元数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreType(String [] MetastoreType) {
        this.MetastoreType = MetastoreType;
    }

    /**
     * Get 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreTypeName 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetastoreTypeName() {
        return this.MetastoreTypeName;
    }

    /**
     * Set 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreTypeName 元数据类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreTypeName(String MetastoreTypeName) {
        this.MetastoreTypeName = MetastoreTypeName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnSet 字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColumnLineageInfo [] getColumnSet() {
        return this.ColumnSet;
    }

    /**
     * Set 字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnSet 字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnSet(ColumnLineageInfo [] ColumnSet) {
        this.ColumnSet = ColumnSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLineageColumnsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLineageColumnsResponse(DescribeLineageColumnsResponse source) {
        if (source.MetastoreType != null) {
            this.MetastoreType = new String[source.MetastoreType.length];
            for (int i = 0; i < source.MetastoreType.length; i++) {
                this.MetastoreType[i] = new String(source.MetastoreType[i]);
            }
        }
        if (source.MetastoreTypeName != null) {
            this.MetastoreTypeName = new String(source.MetastoreTypeName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ColumnSet != null) {
            this.ColumnSet = new ColumnLineageInfo[source.ColumnSet.length];
            for (int i = 0; i < source.ColumnSet.length; i++) {
                this.ColumnSet[i] = new ColumnLineageInfo(source.ColumnSet[i]);
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
        this.setParamArraySimple(map, prefix + "MetastoreType.", this.MetastoreType);
        this.setParamSimple(map, prefix + "MetastoreTypeName", this.MetastoreTypeName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArrayObj(map, prefix + "ColumnSet.", this.ColumnSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

