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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDataEngineConfigRequest extends AbstractModel {

    /**
    * 引擎ID
    */
    @SerializedName("DataEngineIds")
    @Expose
    private String [] DataEngineIds;

    /**
    * 引擎配置命令，支持UpdateSparkSQLLakefsPath（更新原生表配置）、UpdateSparkSQLResultPath（更新结果路径配置）
    */
    @SerializedName("DataEngineConfigCommand")
    @Expose
    private String DataEngineConfigCommand;

    /**
     * Get 引擎ID 
     * @return DataEngineIds 引擎ID
     */
    public String [] getDataEngineIds() {
        return this.DataEngineIds;
    }

    /**
     * Set 引擎ID
     * @param DataEngineIds 引擎ID
     */
    public void setDataEngineIds(String [] DataEngineIds) {
        this.DataEngineIds = DataEngineIds;
    }

    /**
     * Get 引擎配置命令，支持UpdateSparkSQLLakefsPath（更新原生表配置）、UpdateSparkSQLResultPath（更新结果路径配置） 
     * @return DataEngineConfigCommand 引擎配置命令，支持UpdateSparkSQLLakefsPath（更新原生表配置）、UpdateSparkSQLResultPath（更新结果路径配置）
     */
    public String getDataEngineConfigCommand() {
        return this.DataEngineConfigCommand;
    }

    /**
     * Set 引擎配置命令，支持UpdateSparkSQLLakefsPath（更新原生表配置）、UpdateSparkSQLResultPath（更新结果路径配置）
     * @param DataEngineConfigCommand 引擎配置命令，支持UpdateSparkSQLLakefsPath（更新原生表配置）、UpdateSparkSQLResultPath（更新结果路径配置）
     */
    public void setDataEngineConfigCommand(String DataEngineConfigCommand) {
        this.DataEngineConfigCommand = DataEngineConfigCommand;
    }

    public UpdateDataEngineConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDataEngineConfigRequest(UpdateDataEngineConfigRequest source) {
        if (source.DataEngineIds != null) {
            this.DataEngineIds = new String[source.DataEngineIds.length];
            for (int i = 0; i < source.DataEngineIds.length; i++) {
                this.DataEngineIds[i] = new String(source.DataEngineIds[i]);
            }
        }
        if (source.DataEngineConfigCommand != null) {
            this.DataEngineConfigCommand = new String(source.DataEngineConfigCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataEngineIds.", this.DataEngineIds);
        this.setParamSimple(map, prefix + "DataEngineConfigCommand", this.DataEngineConfigCommand);

    }
}

