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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTableQuotasRequest extends AbstractModel {

    /**
    * 带扩缩容表所属集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 已选中待修改的表配额列表
    */
    @SerializedName("TableQuotas")
    @Expose
    private SelectedTableInfoNew [] TableQuotas;

    /**
     * Get 带扩缩容表所属集群ID 
     * @return ClusterId 带扩缩容表所属集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 带扩缩容表所属集群ID
     * @param ClusterId 带扩缩容表所属集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 已选中待修改的表配额列表 
     * @return TableQuotas 已选中待修改的表配额列表
     */
    public SelectedTableInfoNew [] getTableQuotas() {
        return this.TableQuotas;
    }

    /**
     * Set 已选中待修改的表配额列表
     * @param TableQuotas 已选中待修改的表配额列表
     */
    public void setTableQuotas(SelectedTableInfoNew [] TableQuotas) {
        this.TableQuotas = TableQuotas;
    }

    public ModifyTableQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTableQuotasRequest(ModifyTableQuotasRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableQuotas != null) {
            this.TableQuotas = new SelectedTableInfoNew[source.TableQuotas.length];
            for (int i = 0; i < source.TableQuotas.length; i++) {
                this.TableQuotas[i] = new SelectedTableInfoNew(source.TableQuotas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "TableQuotas.", this.TableQuotas);

    }
}

