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

public class BackupExpireRuleInfo extends AbstractModel {

    /**
    * 所属表格组ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 文件标签，见上面描述
    */
    @SerializedName("FileTag")
    @Expose
    private Long FileTag;

    /**
    * 淘汰天数，见上面描述
    */
    @SerializedName("ExpireDay")
    @Expose
    private Long ExpireDay;

    /**
    * 操作类型，见上面描述
    */
    @SerializedName("OperType")
    @Expose
    private Long OperType;

    /**
     * Get 所属表格组ID 
     * @return TableGroupId 所属表格组ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set 所属表格组ID
     * @param TableGroupId 所属表格组ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 文件标签，见上面描述 
     * @return FileTag 文件标签，见上面描述
     */
    public Long getFileTag() {
        return this.FileTag;
    }

    /**
     * Set 文件标签，见上面描述
     * @param FileTag 文件标签，见上面描述
     */
    public void setFileTag(Long FileTag) {
        this.FileTag = FileTag;
    }

    /**
     * Get 淘汰天数，见上面描述 
     * @return ExpireDay 淘汰天数，见上面描述
     */
    public Long getExpireDay() {
        return this.ExpireDay;
    }

    /**
     * Set 淘汰天数，见上面描述
     * @param ExpireDay 淘汰天数，见上面描述
     */
    public void setExpireDay(Long ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    /**
     * Get 操作类型，见上面描述 
     * @return OperType 操作类型，见上面描述
     */
    public Long getOperType() {
        return this.OperType;
    }

    /**
     * Set 操作类型，见上面描述
     * @param OperType 操作类型，见上面描述
     */
    public void setOperType(Long OperType) {
        this.OperType = OperType;
    }

    public BackupExpireRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupExpireRuleInfo(BackupExpireRuleInfo source) {
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FileTag != null) {
            this.FileTag = new Long(source.FileTag);
        }
        if (source.ExpireDay != null) {
            this.ExpireDay = new Long(source.ExpireDay);
        }
        if (source.OperType != null) {
            this.OperType = new Long(source.OperType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FileTag", this.FileTag);
        this.setParamSimple(map, prefix + "ExpireDay", this.ExpireDay);
        this.setParamSimple(map, prefix + "OperType", this.OperType);

    }
}

