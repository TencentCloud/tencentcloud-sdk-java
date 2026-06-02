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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WizardConfig extends AbstractModel {

    /**
    * <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbTable")
    @Expose
    private String DbTable;

    /**
    * <p>是否分页</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbEnablePaging")
    @Expose
    private Boolean DbEnablePaging;

    /**
    * <p>请求参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbReqParams")
    @Expose
    private ServiceDatabaseReqParam [] DbReqParams;

    /**
    * <p>响应参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbRespParams")
    @Expose
    private ServiceDatabaseRespParam [] DbRespParams;

    /**
    * <p>排序参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbOrdParams")
    @Expose
    private ServiceDatabaseOrderParam [] DbOrdParams;

    /**
    * <p>是否开启出参映射</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbEnableMappingResp")
    @Expose
    private Boolean DbEnableMappingResp;

    /**
     * Get <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbTable <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbTable() {
        return this.DbTable;
    }

    /**
     * Set <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbTable <p>表名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbTable(String DbTable) {
        this.DbTable = DbTable;
    }

    /**
     * Get <p>是否分页</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbEnablePaging <p>是否分页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDbEnablePaging() {
        return this.DbEnablePaging;
    }

    /**
     * Set <p>是否分页</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbEnablePaging <p>是否分页</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbEnablePaging(Boolean DbEnablePaging) {
        this.DbEnablePaging = DbEnablePaging;
    }

    /**
     * Get <p>请求参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbReqParams <p>请求参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceDatabaseReqParam [] getDbReqParams() {
        return this.DbReqParams;
    }

    /**
     * Set <p>请求参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbReqParams <p>请求参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbReqParams(ServiceDatabaseReqParam [] DbReqParams) {
        this.DbReqParams = DbReqParams;
    }

    /**
     * Get <p>响应参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbRespParams <p>响应参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceDatabaseRespParam [] getDbRespParams() {
        return this.DbRespParams;
    }

    /**
     * Set <p>响应参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbRespParams <p>响应参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbRespParams(ServiceDatabaseRespParam [] DbRespParams) {
        this.DbRespParams = DbRespParams;
    }

    /**
     * Get <p>排序参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbOrdParams <p>排序参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceDatabaseOrderParam [] getDbOrdParams() {
        return this.DbOrdParams;
    }

    /**
     * Set <p>排序参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbOrdParams <p>排序参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbOrdParams(ServiceDatabaseOrderParam [] DbOrdParams) {
        this.DbOrdParams = DbOrdParams;
    }

    /**
     * Get <p>是否开启出参映射</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbEnableMappingResp <p>是否开启出参映射</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDbEnableMappingResp() {
        return this.DbEnableMappingResp;
    }

    /**
     * Set <p>是否开启出参映射</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbEnableMappingResp <p>是否开启出参映射</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbEnableMappingResp(Boolean DbEnableMappingResp) {
        this.DbEnableMappingResp = DbEnableMappingResp;
    }

    public WizardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WizardConfig(WizardConfig source) {
        if (source.DbTable != null) {
            this.DbTable = new String(source.DbTable);
        }
        if (source.DbEnablePaging != null) {
            this.DbEnablePaging = new Boolean(source.DbEnablePaging);
        }
        if (source.DbReqParams != null) {
            this.DbReqParams = new ServiceDatabaseReqParam[source.DbReqParams.length];
            for (int i = 0; i < source.DbReqParams.length; i++) {
                this.DbReqParams[i] = new ServiceDatabaseReqParam(source.DbReqParams[i]);
            }
        }
        if (source.DbRespParams != null) {
            this.DbRespParams = new ServiceDatabaseRespParam[source.DbRespParams.length];
            for (int i = 0; i < source.DbRespParams.length; i++) {
                this.DbRespParams[i] = new ServiceDatabaseRespParam(source.DbRespParams[i]);
            }
        }
        if (source.DbOrdParams != null) {
            this.DbOrdParams = new ServiceDatabaseOrderParam[source.DbOrdParams.length];
            for (int i = 0; i < source.DbOrdParams.length; i++) {
                this.DbOrdParams[i] = new ServiceDatabaseOrderParam(source.DbOrdParams[i]);
            }
        }
        if (source.DbEnableMappingResp != null) {
            this.DbEnableMappingResp = new Boolean(source.DbEnableMappingResp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbTable", this.DbTable);
        this.setParamSimple(map, prefix + "DbEnablePaging", this.DbEnablePaging);
        this.setParamArrayObj(map, prefix + "DbReqParams.", this.DbReqParams);
        this.setParamArrayObj(map, prefix + "DbRespParams.", this.DbRespParams);
        this.setParamArrayObj(map, prefix + "DbOrdParams.", this.DbOrdParams);
        this.setParamSimple(map, prefix + "DbEnableMappingResp", this.DbEnableMappingResp);

    }
}

