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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushUrlsCacheRequest extends AbstractModel{

    /**
    * URL 列表，需要包含协议头部 http:// 或 https://
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 中国境内区域默认预热至中间层节点，中国境外区域默认预热至边缘节点。预热至边缘产生的边缘层流量会计入计费流量。
填写"middle"或不填充时，可指定预热至中间层节点。
    */
    @SerializedName("Layer")
    @Expose
    private String Layer;

    /**
    * 是否递归解析m3u8文件中的ts分片预热
注意事项：
1. 该功能要求m3u8索引文件能直接请求获取
2. 当前只支持递归解析一级索引和子索引中的ts分片，递归深度不超过3层
3. 解析获取的ts分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热
    */
    @SerializedName("ParseM3U8")
    @Expose
    private Boolean ParseM3U8;

    /**
    * 是否关闭Range回源
注意事项：
此功能灰度发布中，敬请期待
    */
    @SerializedName("DisableRange")
    @Expose
    private Boolean DisableRange;

    /**
     * Get URL 列表，需要包含协议头部 http:// 或 https:// 
     * @return Urls URL 列表，需要包含协议头部 http:// 或 https://
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set URL 列表，需要包含协议头部 http:// 或 https://
     * @param Urls URL 列表，需要包含协议头部 http:// 或 https://
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn 
     * @return UserAgent 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
     * @param UserAgent 指定预热请求回源时 HTTP 请求的 User-Agent 头部
默认为 TencentCdn
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务 
     * @return Area 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
     * @param Area 预热生效区域
mainland：预热至境内节点
overseas：预热至境外节点
global：预热全球节点
不填充情况下，默认为 mainland， URL 中域名必须在对应区域启用了加速服务才能提交对应区域的预热任务
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 中国境内区域默认预热至中间层节点，中国境外区域默认预热至边缘节点。预热至边缘产生的边缘层流量会计入计费流量。
填写"middle"或不填充时，可指定预热至中间层节点。 
     * @return Layer 中国境内区域默认预热至中间层节点，中国境外区域默认预热至边缘节点。预热至边缘产生的边缘层流量会计入计费流量。
填写"middle"或不填充时，可指定预热至中间层节点。
     */
    public String getLayer() {
        return this.Layer;
    }

    /**
     * Set 中国境内区域默认预热至中间层节点，中国境外区域默认预热至边缘节点。预热至边缘产生的边缘层流量会计入计费流量。
填写"middle"或不填充时，可指定预热至中间层节点。
     * @param Layer 中国境内区域默认预热至中间层节点，中国境外区域默认预热至边缘节点。预热至边缘产生的边缘层流量会计入计费流量。
填写"middle"或不填充时，可指定预热至中间层节点。
     */
    public void setLayer(String Layer) {
        this.Layer = Layer;
    }

    /**
     * Get 是否递归解析m3u8文件中的ts分片预热
注意事项：
1. 该功能要求m3u8索引文件能直接请求获取
2. 当前只支持递归解析一级索引和子索引中的ts分片，递归深度不超过3层
3. 解析获取的ts分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热 
     * @return ParseM3U8 是否递归解析m3u8文件中的ts分片预热
注意事项：
1. 该功能要求m3u8索引文件能直接请求获取
2. 当前只支持递归解析一级索引和子索引中的ts分片，递归深度不超过3层
3. 解析获取的ts分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热
     */
    public Boolean getParseM3U8() {
        return this.ParseM3U8;
    }

    /**
     * Set 是否递归解析m3u8文件中的ts分片预热
注意事项：
1. 该功能要求m3u8索引文件能直接请求获取
2. 当前只支持递归解析一级索引和子索引中的ts分片，递归深度不超过3层
3. 解析获取的ts分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热
     * @param ParseM3U8 是否递归解析m3u8文件中的ts分片预热
注意事项：
1. 该功能要求m3u8索引文件能直接请求获取
2. 当前只支持递归解析一级索引和子索引中的ts分片，递归深度不超过3层
3. 解析获取的ts分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热
     */
    public void setParseM3U8(Boolean ParseM3U8) {
        this.ParseM3U8 = ParseM3U8;
    }

    /**
     * Get 是否关闭Range回源
注意事项：
此功能灰度发布中，敬请期待 
     * @return DisableRange 是否关闭Range回源
注意事项：
此功能灰度发布中，敬请期待
     */
    public Boolean getDisableRange() {
        return this.DisableRange;
    }

    /**
     * Set 是否关闭Range回源
注意事项：
此功能灰度发布中，敬请期待
     * @param DisableRange 是否关闭Range回源
注意事项：
此功能灰度发布中，敬请期待
     */
    public void setDisableRange(Boolean DisableRange) {
        this.DisableRange = DisableRange;
    }

    public PushUrlsCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushUrlsCacheRequest(PushUrlsCacheRequest source) {
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Layer != null) {
            this.Layer = new String(source.Layer);
        }
        if (source.ParseM3U8 != null) {
            this.ParseM3U8 = new Boolean(source.ParseM3U8);
        }
        if (source.DisableRange != null) {
            this.DisableRange = new Boolean(source.DisableRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Layer", this.Layer);
        this.setParamSimple(map, prefix + "ParseM3U8", this.ParseM3U8);
        this.setParamSimple(map, prefix + "DisableRange", this.DisableRange);

    }
}

