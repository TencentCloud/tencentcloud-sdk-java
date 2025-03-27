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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributeRule extends AbstractModel {

    /**
    * 规则类型。非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区，cols-按列名分区。mongo的枚举值为：collection-按集合名分区、collectionAndObjectId-按集合+主键分区。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 库名匹配规则，请填写正则表达式
    */
    @SerializedName("DbPattern")
    @Expose
    private String DbPattern;

    /**
    * 表名匹配规则，如果 DatabaseType 为 mongodb，则匹配集合名
    */
    @SerializedName("TablePattern")
    @Expose
    private String TablePattern;

    /**
    * 列名。如果 RuleType 为 cols，此项必填。订阅任务会用该列的值计算分区。mongo没有按列分区，因此也不用传这个字段。
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
     * Get 规则类型。非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区，cols-按列名分区。mongo的枚举值为：collection-按集合名分区、collectionAndObjectId-按集合+主键分区。 
     * @return RuleType 规则类型。非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区，cols-按列名分区。mongo的枚举值为：collection-按集合名分区、collectionAndObjectId-按集合+主键分区。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型。非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区，cols-按列名分区。mongo的枚举值为：collection-按集合名分区、collectionAndObjectId-按集合+主键分区。
     * @param RuleType 规则类型。非mongo产品的枚举值为: table-按表名分区，pk-按表名+主键分区，cols-按列名分区。mongo的枚举值为：collection-按集合名分区、collectionAndObjectId-按集合+主键分区。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 库名匹配规则，请填写正则表达式 
     * @return DbPattern 库名匹配规则，请填写正则表达式
     */
    public String getDbPattern() {
        return this.DbPattern;
    }

    /**
     * Set 库名匹配规则，请填写正则表达式
     * @param DbPattern 库名匹配规则，请填写正则表达式
     */
    public void setDbPattern(String DbPattern) {
        this.DbPattern = DbPattern;
    }

    /**
     * Get 表名匹配规则，如果 DatabaseType 为 mongodb，则匹配集合名 
     * @return TablePattern 表名匹配规则，如果 DatabaseType 为 mongodb，则匹配集合名
     */
    public String getTablePattern() {
        return this.TablePattern;
    }

    /**
     * Set 表名匹配规则，如果 DatabaseType 为 mongodb，则匹配集合名
     * @param TablePattern 表名匹配规则，如果 DatabaseType 为 mongodb，则匹配集合名
     */
    public void setTablePattern(String TablePattern) {
        this.TablePattern = TablePattern;
    }

    /**
     * Get 列名。如果 RuleType 为 cols，此项必填。订阅任务会用该列的值计算分区。mongo没有按列分区，因此也不用传这个字段。 
     * @return Columns 列名。如果 RuleType 为 cols，此项必填。订阅任务会用该列的值计算分区。mongo没有按列分区，因此也不用传这个字段。
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 列名。如果 RuleType 为 cols，此项必填。订阅任务会用该列的值计算分区。mongo没有按列分区，因此也不用传这个字段。
     * @param Columns 列名。如果 RuleType 为 cols，此项必填。订阅任务会用该列的值计算分区。mongo没有按列分区，因此也不用传这个字段。
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    public DistributeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeRule(DistributeRule source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.DbPattern != null) {
            this.DbPattern = new String(source.DbPattern);
        }
        if (source.TablePattern != null) {
            this.TablePattern = new String(source.TablePattern);
        }
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "DbPattern", this.DbPattern);
        this.setParamSimple(map, prefix + "TablePattern", this.TablePattern);
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);

    }
}

