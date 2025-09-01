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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePermissionStatusInfoRequest extends AbstractModel {

    /**
    * 页数
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 1
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 页数 
     * @return TableId 页数
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set 页数
     * @param TableId 页数
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 1 
     * @return ProjectId 1
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 1
     * @param ProjectId 1
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribePermissionStatusInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePermissionStatusInfoRequest(DescribePermissionStatusInfoRequest source) {
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

