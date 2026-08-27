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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceCacheKeyParams extends AbstractModel {

    /**
    * <p>全 URL 缓存开关</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("FullURLCache")
    @Expose
    private String FullURLCache;

    /**
    * <p>查询参数是否参与缓存键</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("QueryStringSwitch")
    @Expose
    private String QueryStringSwitch;

    /**
    * <p>QueryStringSwitch=on 时必填</p><p>枚举值：</p><ul><li>includeCustom： 白名单</li><li>excludeCustom： 黑名单</li></ul>
    */
    @SerializedName("QueryStringAction")
    @Expose
    private String QueryStringAction;

    /**
    * <p>参数名列表</p><p>入参限制：最多 100 项，单项 1~128 字节</p>
    */
    @SerializedName("QueryStringValues")
    @Expose
    private String [] QueryStringValues;

    /**
     * Get <p>全 URL 缓存开关</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return FullURLCache <p>全 URL 缓存开关</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getFullURLCache() {
        return this.FullURLCache;
    }

    /**
     * Set <p>全 URL 缓存开关</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param FullURLCache <p>全 URL 缓存开关</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setFullURLCache(String FullURLCache) {
        this.FullURLCache = FullURLCache;
    }

    /**
     * Get <p>查询参数是否参与缓存键</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return QueryStringSwitch <p>查询参数是否参与缓存键</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getQueryStringSwitch() {
        return this.QueryStringSwitch;
    }

    /**
     * Set <p>查询参数是否参与缓存键</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param QueryStringSwitch <p>查询参数是否参与缓存键</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setQueryStringSwitch(String QueryStringSwitch) {
        this.QueryStringSwitch = QueryStringSwitch;
    }

    /**
     * Get <p>QueryStringSwitch=on 时必填</p><p>枚举值：</p><ul><li>includeCustom： 白名单</li><li>excludeCustom： 黑名单</li></ul> 
     * @return QueryStringAction <p>QueryStringSwitch=on 时必填</p><p>枚举值：</p><ul><li>includeCustom： 白名单</li><li>excludeCustom： 黑名单</li></ul>
     */
    public String getQueryStringAction() {
        return this.QueryStringAction;
    }

    /**
     * Set <p>QueryStringSwitch=on 时必填</p><p>枚举值：</p><ul><li>includeCustom： 白名单</li><li>excludeCustom： 黑名单</li></ul>
     * @param QueryStringAction <p>QueryStringSwitch=on 时必填</p><p>枚举值：</p><ul><li>includeCustom： 白名单</li><li>excludeCustom： 黑名单</li></ul>
     */
    public void setQueryStringAction(String QueryStringAction) {
        this.QueryStringAction = QueryStringAction;
    }

    /**
     * Get <p>参数名列表</p><p>入参限制：最多 100 项，单项 1~128 字节</p> 
     * @return QueryStringValues <p>参数名列表</p><p>入参限制：最多 100 项，单项 1~128 字节</p>
     */
    public String [] getQueryStringValues() {
        return this.QueryStringValues;
    }

    /**
     * Set <p>参数名列表</p><p>入参限制：最多 100 项，单项 1~128 字节</p>
     * @param QueryStringValues <p>参数名列表</p><p>入参限制：最多 100 项，单项 1~128 字节</p>
     */
    public void setQueryStringValues(String [] QueryStringValues) {
        this.QueryStringValues = QueryStringValues;
    }

    public HTTPServiceCacheKeyParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceCacheKeyParams(HTTPServiceCacheKeyParams source) {
        if (source.FullURLCache != null) {
            this.FullURLCache = new String(source.FullURLCache);
        }
        if (source.QueryStringSwitch != null) {
            this.QueryStringSwitch = new String(source.QueryStringSwitch);
        }
        if (source.QueryStringAction != null) {
            this.QueryStringAction = new String(source.QueryStringAction);
        }
        if (source.QueryStringValues != null) {
            this.QueryStringValues = new String[source.QueryStringValues.length];
            for (int i = 0; i < source.QueryStringValues.length; i++) {
                this.QueryStringValues[i] = new String(source.QueryStringValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullURLCache", this.FullURLCache);
        this.setParamSimple(map, prefix + "QueryStringSwitch", this.QueryStringSwitch);
        this.setParamSimple(map, prefix + "QueryStringAction", this.QueryStringAction);
        this.setParamArraySimple(map, prefix + "QueryStringValues.", this.QueryStringValues);

    }
}

