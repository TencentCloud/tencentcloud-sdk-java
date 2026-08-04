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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEnvironmentCacheRequest extends AbstractModel {

    /**
    * <p>环境ID。</p>
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * <p>缓存类型</p><p>枚举值：</p><ul><li>RUNTIME： 清理默认缓存卷的运行缓存目录</li><li>INPUT： 清理默认缓存卷的输入缓存目录</li><li>ALL： 清空环境下全部有效缓存卷</li><li>PATH： 指定缓存卷下指定路径，需要在Path中填入实际绝对路径</li></ul>
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * <p>指定路径删除</p><p>入参限制：以盘符开头的绝对路径地址</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get <p>环境ID。</p> 
     * @return EnvironmentId <p>环境ID。</p>
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set <p>环境ID。</p>
     * @param EnvironmentId <p>环境ID。</p>
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get <p>缓存类型</p><p>枚举值：</p><ul><li>RUNTIME： 清理默认缓存卷的运行缓存目录</li><li>INPUT： 清理默认缓存卷的输入缓存目录</li><li>ALL： 清空环境下全部有效缓存卷</li><li>PATH： 指定缓存卷下指定路径，需要在Path中填入实际绝对路径</li></ul> 
     * @return CacheType <p>缓存类型</p><p>枚举值：</p><ul><li>RUNTIME： 清理默认缓存卷的运行缓存目录</li><li>INPUT： 清理默认缓存卷的输入缓存目录</li><li>ALL： 清空环境下全部有效缓存卷</li><li>PATH： 指定缓存卷下指定路径，需要在Path中填入实际绝对路径</li></ul>
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set <p>缓存类型</p><p>枚举值：</p><ul><li>RUNTIME： 清理默认缓存卷的运行缓存目录</li><li>INPUT： 清理默认缓存卷的输入缓存目录</li><li>ALL： 清空环境下全部有效缓存卷</li><li>PATH： 指定缓存卷下指定路径，需要在Path中填入实际绝对路径</li></ul>
     * @param CacheType <p>缓存类型</p><p>枚举值：</p><ul><li>RUNTIME： 清理默认缓存卷的运行缓存目录</li><li>INPUT： 清理默认缓存卷的输入缓存目录</li><li>ALL： 清空环境下全部有效缓存卷</li><li>PATH： 指定缓存卷下指定路径，需要在Path中填入实际绝对路径</li></ul>
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get <p>指定路径删除</p><p>入参限制：以盘符开头的绝对路径地址</p> 
     * @return Path <p>指定路径删除</p><p>入参限制：以盘符开头的绝对路径地址</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>指定路径删除</p><p>入参限制：以盘符开头的绝对路径地址</p>
     * @param Path <p>指定路径删除</p><p>入参限制：以盘符开头的绝对路径地址</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public DeleteEnvironmentCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEnvironmentCacheRequest(DeleteEnvironmentCacheRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

