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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTableGroupRequest extends AbstractModel{

    /**
    * 表格组所属的集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
     * Get 表格组所属的集群ID 
     * @return ClusterId 表格组所属的集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 表格组所属的集群ID
     * @param ClusterId 表格组所属的集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 表格组ID 
     * @return TableGroupId 表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 表格组ID
     * @param TableGroupId 表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);

    }
}

