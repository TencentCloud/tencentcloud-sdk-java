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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicRule extends AbstractModel{

    /**
    * topic名
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * topic分区策略，如 自定义topic：Random（随机投递），集中投递到单Topic：AllInPartitionZero（全部投递至partition0）、PartitionByTable(按表名分区)、PartitionByTableAndKey(按表名加主键分区)
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * 库名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余库)，数组中必须有一项为‘Default’
    */
    @SerializedName("DbMatchMode")
    @Expose
    private String DbMatchMode;

    /**
    * 库名，仅“自定义topic”时，DbMatchMode=Regular生效
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余表)，数组中必须有一项为‘Default’
    */
    @SerializedName("TableMatchMode")
    @Expose
    private String TableMatchMode;

    /**
    * 表名，仅“自定义topic”时，TableMatchMode=Regular生效
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get topic名 
     * @return TopicName topic名
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set topic名
     * @param TopicName topic名
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get topic分区策略，如 自定义topic：Random（随机投递），集中投递到单Topic：AllInPartitionZero（全部投递至partition0）、PartitionByTable(按表名分区)、PartitionByTableAndKey(按表名加主键分区) 
     * @return PartitionType topic分区策略，如 自定义topic：Random（随机投递），集中投递到单Topic：AllInPartitionZero（全部投递至partition0）、PartitionByTable(按表名分区)、PartitionByTableAndKey(按表名加主键分区)
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set topic分区策略，如 自定义topic：Random（随机投递），集中投递到单Topic：AllInPartitionZero（全部投递至partition0）、PartitionByTable(按表名分区)、PartitionByTableAndKey(按表名加主键分区)
     * @param PartitionType topic分区策略，如 自定义topic：Random（随机投递），集中投递到单Topic：AllInPartitionZero（全部投递至partition0）、PartitionByTable(按表名分区)、PartitionByTableAndKey(按表名加主键分区)
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get 库名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余库)，数组中必须有一项为‘Default’ 
     * @return DbMatchMode 库名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余库)，数组中必须有一项为‘Default’
     */
    public String getDbMatchMode() {
        return this.DbMatchMode;
    }

    /**
     * Set 库名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余库)，数组中必须有一项为‘Default’
     * @param DbMatchMode 库名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余库)，数组中必须有一项为‘Default’
     */
    public void setDbMatchMode(String DbMatchMode) {
        this.DbMatchMode = DbMatchMode;
    }

    /**
     * Get 库名，仅“自定义topic”时，DbMatchMode=Regular生效 
     * @return DbName 库名，仅“自定义topic”时，DbMatchMode=Regular生效
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 库名，仅“自定义topic”时，DbMatchMode=Regular生效
     * @param DbName 库名，仅“自定义topic”时，DbMatchMode=Regular生效
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 表名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余表)，数组中必须有一项为‘Default’ 
     * @return TableMatchMode 表名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余表)，数组中必须有一项为‘Default’
     */
    public String getTableMatchMode() {
        return this.TableMatchMode;
    }

    /**
     * Set 表名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余表)，数组中必须有一项为‘Default’
     * @param TableMatchMode 表名匹配规则，仅“自定义topic”生效，如Regular（正则匹配）, Default(不符合匹配规则的剩余表)，数组中必须有一项为‘Default’
     */
    public void setTableMatchMode(String TableMatchMode) {
        this.TableMatchMode = TableMatchMode;
    }

    /**
     * Get 表名，仅“自定义topic”时，TableMatchMode=Regular生效 
     * @return TableName 表名，仅“自定义topic”时，TableMatchMode=Regular生效
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名，仅“自定义topic”时，TableMatchMode=Regular生效
     * @param TableName 表名，仅“自定义topic”时，TableMatchMode=Regular生效
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public TopicRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicRule(TopicRule source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionType != null) {
            this.PartitionType = new String(source.PartitionType);
        }
        if (source.DbMatchMode != null) {
            this.DbMatchMode = new String(source.DbMatchMode);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.TableMatchMode != null) {
            this.TableMatchMode = new String(source.TableMatchMode);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "DbMatchMode", this.DbMatchMode);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "TableMatchMode", this.TableMatchMode);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

