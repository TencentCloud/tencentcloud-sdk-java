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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FormatConfigs extends AbstractModel {

    /**
    * <p>合同对比结果过滤项</p><p>枚举值：</p><ul><li>1： 标点符号</li><li>2： 页眉页脚（包含页码）</li><li>3： 目录</li><li>4： 印章</li><li>5： 序号</li><li>6： 水印</li><li>7： 下划线</li></ul>
    */
    @SerializedName("Values")
    @Expose
    private Long [] Values;

    /**
     * Get <p>合同对比结果过滤项</p><p>枚举值：</p><ul><li>1： 标点符号</li><li>2： 页眉页脚（包含页码）</li><li>3： 目录</li><li>4： 印章</li><li>5： 序号</li><li>6： 水印</li><li>7： 下划线</li></ul> 
     * @return Values <p>合同对比结果过滤项</p><p>枚举值：</p><ul><li>1： 标点符号</li><li>2： 页眉页脚（包含页码）</li><li>3： 目录</li><li>4： 印章</li><li>5： 序号</li><li>6： 水印</li><li>7： 下划线</li></ul>
     */
    public Long [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>合同对比结果过滤项</p><p>枚举值：</p><ul><li>1： 标点符号</li><li>2： 页眉页脚（包含页码）</li><li>3： 目录</li><li>4： 印章</li><li>5： 序号</li><li>6： 水印</li><li>7： 下划线</li></ul>
     * @param Values <p>合同对比结果过滤项</p><p>枚举值：</p><ul><li>1： 标点符号</li><li>2： 页眉页脚（包含页码）</li><li>3： 目录</li><li>4： 印章</li><li>5： 序号</li><li>6： 水印</li><li>7： 下划线</li></ul>
     */
    public void setValues(Long [] Values) {
        this.Values = Values;
    }

    public FormatConfigs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FormatConfigs(FormatConfigs source) {
        if (source.Values != null) {
            this.Values = new Long[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Long(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

