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

public class ModifyTableMemosRequest extends AbstractModel {

    /**
    * 表所属集群实例ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 选定表详情列表
    */
    @SerializedName("TableMemos")
    @Expose
    private SelectedTableInfoNew [] TableMemos;

    /**
     * Get 表所属集群实例ID 
     * @return ClusterId 表所属集群实例ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表所属集群实例ID
     * @param ClusterId 表所属集群实例ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 选定表详情列表 
     * @return TableMemos 选定表详情列表
     */
    public SelectedTableInfoNew [] getTableMemos() {
        return this.TableMemos;
    }

    /**
     * Set 选定表详情列表
     * @param TableMemos 选定表详情列表
     */
    public void setTableMemos(SelectedTableInfoNew [] TableMemos) {
        this.TableMemos = TableMemos;
    }

    public ModifyTableMemosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTableMemosRequest(ModifyTableMemosRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableMemos != null) {
            this.TableMemos = new SelectedTableInfoNew[source.TableMemos.length];
            for (int i = 0; i < source.TableMemos.length; i++) {
                this.TableMemos[i] = new SelectedTableInfoNew(source.TableMemos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "TableMemos.", this.TableMemos);

    }
}

