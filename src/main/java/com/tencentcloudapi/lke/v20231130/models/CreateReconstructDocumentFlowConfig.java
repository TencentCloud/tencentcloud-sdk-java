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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReconstructDocumentFlowConfig extends AbstractModel {

    /**
    * Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为1
    */
    @SerializedName("TableResultType")
    @Expose
    private String TableResultType;

    /**
     * Get Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为1 
     * @return TableResultType Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为1
     */
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为1
     * @param TableResultType Markdown文件中表格返回的形式
0，表格以MD形式返回
1，表格以HTML形式返回
默认为1
     */
    public void setTableResultType(String TableResultType) {
        this.TableResultType = TableResultType;
    }

    public CreateReconstructDocumentFlowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReconstructDocumentFlowConfig(CreateReconstructDocumentFlowConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableResultType", this.TableResultType);

    }
}

