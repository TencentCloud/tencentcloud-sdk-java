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
package com.tencentcloudapi.wsa.v20250508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchProResponse extends AbstractModel {

    /**
    * 原始查询语
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 搜索结果页面详情，格式为json字符串。
title：结果标题
date：内容发布时间
url：内容发布源url
passage：标准摘要
content：动态摘要 （尊享版字段）
site：网站名称，部分不知名站点结果可能为空
score：相关性得分，取值0～1，越靠近1表示越相关
images：图片列表
favicon：网站图标链接，部分不知名站点结果可能为空
    */
    @SerializedName("Pages")
    @Expose
    private String [] Pages;

    /**
    * 用户版本：standard/premium/lite
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 提示信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 原始查询语 
     * @return Query 原始查询语
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 原始查询语
     * @param Query 原始查询语
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 搜索结果页面详情，格式为json字符串。
title：结果标题
date：内容发布时间
url：内容发布源url
passage：标准摘要
content：动态摘要 （尊享版字段）
site：网站名称，部分不知名站点结果可能为空
score：相关性得分，取值0～1，越靠近1表示越相关
images：图片列表
favicon：网站图标链接，部分不知名站点结果可能为空 
     * @return Pages 搜索结果页面详情，格式为json字符串。
title：结果标题
date：内容发布时间
url：内容发布源url
passage：标准摘要
content：动态摘要 （尊享版字段）
site：网站名称，部分不知名站点结果可能为空
score：相关性得分，取值0～1，越靠近1表示越相关
images：图片列表
favicon：网站图标链接，部分不知名站点结果可能为空
     */
    public String [] getPages() {
        return this.Pages;
    }

    /**
     * Set 搜索结果页面详情，格式为json字符串。
title：结果标题
date：内容发布时间
url：内容发布源url
passage：标准摘要
content：动态摘要 （尊享版字段）
site：网站名称，部分不知名站点结果可能为空
score：相关性得分，取值0～1，越靠近1表示越相关
images：图片列表
favicon：网站图标链接，部分不知名站点结果可能为空
     * @param Pages 搜索结果页面详情，格式为json字符串。
title：结果标题
date：内容发布时间
url：内容发布源url
passage：标准摘要
content：动态摘要 （尊享版字段）
site：网站名称，部分不知名站点结果可能为空
score：相关性得分，取值0～1，越靠近1表示越相关
images：图片列表
favicon：网站图标链接，部分不知名站点结果可能为空
     */
    public void setPages(String [] Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 用户版本：standard/premium/lite 
     * @return Version 用户版本：standard/premium/lite
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 用户版本：standard/premium/lite
     * @param Version 用户版本：standard/premium/lite
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 提示信息 
     * @return Msg 提示信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 提示信息
     * @param Msg 提示信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SearchProResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchProResponse(SearchProResponse source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Pages != null) {
            this.Pages = new String[source.Pages.length];
            for (int i = 0; i < source.Pages.length; i++) {
                this.Pages[i] = new String(source.Pages[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Pages.", this.Pages);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

