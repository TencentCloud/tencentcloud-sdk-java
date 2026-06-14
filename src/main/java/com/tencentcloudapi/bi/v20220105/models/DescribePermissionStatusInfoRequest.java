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
    * <p>页数</p>
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

    /**
    * <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>1</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get <p>页数</p> 
     * @return TableId <p>页数</p>
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>页数</p>
     * @param TableId <p>页数</p>
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p> 
     * @return Type <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
     * @param Type <p>类型</p><p>枚举值：</p><ul><li>ROW： 行权限</li><li>COLUMN： 列权限</li></ul><p>默认值：ROW</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>1</p> 
     * @return ProjectId <p>1</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>1</p>
     * @param ProjectId <p>1</p>
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

