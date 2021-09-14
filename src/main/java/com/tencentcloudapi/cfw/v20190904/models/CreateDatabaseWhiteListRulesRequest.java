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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatabaseWhiteListRulesRequest extends AbstractModel{

    /**
    * 创建白名单数据
    */
    @SerializedName("DatabaseWhiteListRuleData")
    @Expose
    private DatabaseWhiteListRuleData [] DatabaseWhiteListRuleData;

    /**
     * Get 创建白名单数据 
     * @return DatabaseWhiteListRuleData 创建白名单数据
     */
    public DatabaseWhiteListRuleData [] getDatabaseWhiteListRuleData() {
        return this.DatabaseWhiteListRuleData;
    }

    /**
     * Set 创建白名单数据
     * @param DatabaseWhiteListRuleData 创建白名单数据
     */
    public void setDatabaseWhiteListRuleData(DatabaseWhiteListRuleData [] DatabaseWhiteListRuleData) {
        this.DatabaseWhiteListRuleData = DatabaseWhiteListRuleData;
    }

    public CreateDatabaseWhiteListRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatabaseWhiteListRulesRequest(CreateDatabaseWhiteListRulesRequest source) {
        if (source.DatabaseWhiteListRuleData != null) {
            this.DatabaseWhiteListRuleData = new DatabaseWhiteListRuleData[source.DatabaseWhiteListRuleData.length];
            for (int i = 0; i < source.DatabaseWhiteListRuleData.length; i++) {
                this.DatabaseWhiteListRuleData[i] = new DatabaseWhiteListRuleData(source.DatabaseWhiteListRuleData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DatabaseWhiteListRuleData.", this.DatabaseWhiteListRuleData);

    }
}

