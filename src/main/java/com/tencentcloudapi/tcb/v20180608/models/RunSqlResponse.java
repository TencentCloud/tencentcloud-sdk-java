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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSqlResponse extends AbstractModel {

    /**
    * 查询结果行，每个元素为 JSON 字符串
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
    * 列元数据信息，每个元素为 JSON 字符串，字段包含 `name/databaseType/nullable/length/precision/scale`
    */
    @SerializedName("Infos")
    @Expose
    private String [] Infos;

    /**
    * 受影响的行数（INSERT/UPDATE/DELETE 等语句）
    */
    @SerializedName("RowsAffected")
    @Expose
    private Long RowsAffected;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询结果行，每个元素为 JSON 字符串 
     * @return Items 查询结果行，每个元素为 JSON 字符串
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set 查询结果行，每个元素为 JSON 字符串
     * @param Items 查询结果行，每个元素为 JSON 字符串
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    /**
     * Get 列元数据信息，每个元素为 JSON 字符串，字段包含 `name/databaseType/nullable/length/precision/scale` 
     * @return Infos 列元数据信息，每个元素为 JSON 字符串，字段包含 `name/databaseType/nullable/length/precision/scale`
     */
    public String [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 列元数据信息，每个元素为 JSON 字符串，字段包含 `name/databaseType/nullable/length/precision/scale`
     * @param Infos 列元数据信息，每个元素为 JSON 字符串，字段包含 `name/databaseType/nullable/length/precision/scale`
     */
    public void setInfos(String [] Infos) {
        this.Infos = Infos;
    }

    /**
     * Get 受影响的行数（INSERT/UPDATE/DELETE 等语句） 
     * @return RowsAffected 受影响的行数（INSERT/UPDATE/DELETE 等语句）
     */
    public Long getRowsAffected() {
        return this.RowsAffected;
    }

    /**
     * Set 受影响的行数（INSERT/UPDATE/DELETE 等语句）
     * @param RowsAffected 受影响的行数（INSERT/UPDATE/DELETE 等语句）
     */
    public void setRowsAffected(Long RowsAffected) {
        this.RowsAffected = RowsAffected;
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

    public RunSqlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSqlResponse(RunSqlResponse source) {
        if (source.Items != null) {
            this.Items = new String[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new String(source.Items[i]);
            }
        }
        if (source.Infos != null) {
            this.Infos = new String[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new String(source.Infos[i]);
            }
        }
        if (source.RowsAffected != null) {
            this.RowsAffected = new Long(source.RowsAffected);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Items.", this.Items);
        this.setParamArraySimple(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "RowsAffected", this.RowsAffected);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

