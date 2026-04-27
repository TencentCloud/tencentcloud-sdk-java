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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVarRequest extends AbstractModel {

    /**
    * <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * <p>变量 ID，可通过 CreateVar；DescribeVar；DescribeVarList 接口返回结果中获取。DeleteVar</p>
    */
    @SerializedName("VarId")
    @Expose
    private String VarId;

    /**
    * <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
    */
    @SerializedName("VarModuleType")
    @Expose
    private Long VarModuleType;

    /**
     * Get <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p> 
     * @return AppBizId <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     * @param AppBizId <p>应用ID，获取方法参看如何获取   <a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a>。</p>
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get <p>变量 ID，可通过 CreateVar；DescribeVar；DescribeVarList 接口返回结果中获取。DeleteVar</p> 
     * @return VarId <p>变量 ID，可通过 CreateVar；DescribeVar；DescribeVarList 接口返回结果中获取。DeleteVar</p>
     */
    public String getVarId() {
        return this.VarId;
    }

    /**
     * Set <p>变量 ID，可通过 CreateVar；DescribeVar；DescribeVarList 接口返回结果中获取。DeleteVar</p>
     * @param VarId <p>变量 ID，可通过 CreateVar；DescribeVar；DescribeVarList 接口返回结果中获取。DeleteVar</p>
     */
    public void setVarId(String VarId) {
        this.VarId = VarId;
    }

    /**
     * Get <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p> 
     * @return VarModuleType <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
     */
    public Long getVarModuleType() {
        return this.VarModuleType;
    }

    /**
     * Set <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
     * @param VarModuleType <p>变量模块类型</p><p>枚举值：</p><ul><li>0： API参数</li><li>1： 环境参数</li><li>2： 应用参数</li><li>3： 系统参数</li></ul><p>默认值：0</p>
     */
    public void setVarModuleType(Long VarModuleType) {
        this.VarModuleType = VarModuleType;
    }

    public DeleteVarRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVarRequest(DeleteVarRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.VarId != null) {
            this.VarId = new String(source.VarId);
        }
        if (source.VarModuleType != null) {
            this.VarModuleType = new Long(source.VarModuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "VarId", this.VarId);
        this.setParamSimple(map, prefix + "VarModuleType", this.VarModuleType);

    }
}

