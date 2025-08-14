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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeliveryConfigsRequest extends AbstractModel {

    /**
    * 关键字
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 搜索条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据集ID列表
可通过调用[DescribePrograms](https://cloud.tencent.com/document/product/649/73477)查询已创建的数据集列表或登录[控制台](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program&roleId=role-a22gwdwa)进行查看
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

    /**
    * 日志配置项ID列表
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
    */
    @SerializedName("ConfigIdList")
    @Expose
    private String [] ConfigIdList;

    /**
     * Get 关键字 
     * @return SearchWord 关键字
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 关键字
     * @param SearchWord 关键字
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 搜索条数 
     * @return Limit 搜索条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 搜索条数
     * @param Limit 搜索条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据集ID列表
可通过调用[DescribePrograms](https://cloud.tencent.com/document/product/649/73477)查询已创建的数据集列表或登录[控制台](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program&roleId=role-a22gwdwa)进行查看 
     * @return ProgramIdList 数据集ID列表
可通过调用[DescribePrograms](https://cloud.tencent.com/document/product/649/73477)查询已创建的数据集列表或登录[控制台](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program&roleId=role-a22gwdwa)进行查看
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 数据集ID列表
可通过调用[DescribePrograms](https://cloud.tencent.com/document/product/649/73477)查询已创建的数据集列表或登录[控制台](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program&roleId=role-a22gwdwa)进行查看
     * @param ProgramIdList 数据集ID列表
可通过调用[DescribePrograms](https://cloud.tencent.com/document/product/649/73477)查询已创建的数据集列表或登录[控制台](https://console.cloud.tencent.com/tsf/privilege?rid=1&tab=program&roleId=role-a22gwdwa)进行查看
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    /**
     * Get 日志配置项ID列表
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看 
     * @return ConfigIdList 日志配置项ID列表
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     */
    public String [] getConfigIdList() {
        return this.ConfigIdList;
    }

    /**
     * Set 日志配置项ID列表
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     * @param ConfigIdList 日志配置项ID列表
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     */
    public void setConfigIdList(String [] ConfigIdList) {
        this.ConfigIdList = ConfigIdList;
    }

    public DescribeDeliveryConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeliveryConfigsRequest(DescribeDeliveryConfigsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
        if (source.ConfigIdList != null) {
            this.ConfigIdList = new String[source.ConfigIdList.length];
            for (int i = 0; i < source.ConfigIdList.length; i++) {
                this.ConfigIdList[i] = new String(source.ConfigIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);
        this.setParamArraySimple(map, prefix + "ConfigIdList.", this.ConfigIdList);

    }
}

