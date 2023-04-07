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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventByTableRequest extends AbstractModel{

    /**
    * 事件表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 事件表id号
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
     * Get 事件表名 
     * @return TableName 事件表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 事件表名
     * @param TableName 事件表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 事件表id号 
     * @return Ids 事件表id号
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 事件表id号
     * @param Ids 事件表id号
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    public DescribeEventByTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventByTableRequest(DescribeEventByTableRequest source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

