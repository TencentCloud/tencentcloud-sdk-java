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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBBackupsRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份方式，当前支持：0-逻辑备份，1-物理备份，2-所有备份。默认为逻辑备份。
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * 分页大小，最大值为100，不设置默认查询所有。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，最小值为0，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份方式，当前支持：0-逻辑备份，1-物理备份，2-所有备份。默认为逻辑备份。 
     * @return BackupMethod 备份方式，当前支持：0-逻辑备份，1-物理备份，2-所有备份。默认为逻辑备份。
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set 备份方式，当前支持：0-逻辑备份，1-物理备份，2-所有备份。默认为逻辑备份。
     * @param BackupMethod 备份方式，当前支持：0-逻辑备份，1-物理备份，2-所有备份。默认为逻辑备份。
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get 分页大小，最大值为100，不设置默认查询所有。 
     * @return Limit 分页大小，最大值为100，不设置默认查询所有。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，最大值为100，不设置默认查询所有。
     * @param Limit 分页大小，最大值为100，不设置默认查询所有。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，最小值为0，默认值为0。 
     * @return Offset 分页偏移量，最小值为0，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，最小值为0，默认值为0。
     * @param Offset 分页偏移量，最小值为0，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

