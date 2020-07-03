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

public class TableGroupInfo extends AbstractModel{

    /**
    * 表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表格组名称
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * 表格组创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 表格组包含的表格数量
    */
    @SerializedName("TableCount")
    @Expose
    private Long TableCount;

    /**
    * 表格组包含的表格存储总量（MB）
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

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
     * Get 表格组名称 
     * @return TableGroupName 表格组名称
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set 表格组名称
     * @param TableGroupName 表格组名称
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get 表格组创建时间 
     * @return CreatedTime 表格组创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 表格组创建时间
     * @param CreatedTime 表格组创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 表格组包含的表格数量 
     * @return TableCount 表格组包含的表格数量
     */
    public Long getTableCount() {
        return this.TableCount;
    }

    /**
     * Set 表格组包含的表格数量
     * @param TableCount 表格组包含的表格数量
     */
    public void setTableCount(Long TableCount) {
        this.TableCount = TableCount;
    }

    /**
     * Get 表格组包含的表格存储总量（MB） 
     * @return TotalSize 表格组包含的表格存储总量（MB）
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 表格组包含的表格存储总量（MB）
     * @param TotalSize 表格组包含的表格存储总量（MB）
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "TableCount", this.TableCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

