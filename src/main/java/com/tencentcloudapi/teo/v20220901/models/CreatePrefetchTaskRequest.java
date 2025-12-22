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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrefetchTaskRequest extends AbstractModel {

    /**
    * 站点 ID。
若您希望快速提交不同站点下的 Targets Url，可以将其填写为 *，但前提是调用该 API 的账号必须具备主账号下全部站点资源的权限。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 要预热的资源列表，必填。每个元素格式类似如下:
http://www.example.com/example.txt。
注意：提交任务数受计费套餐配额限制，请查看 [EO计费套餐](https://cloud.tencent.com/document/product/1552/77380)。
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
    * 预热模式，取值有：
<li>default：默认模式，即预热到中间层；</li>
<li>edge：边缘预热模式，即预热到边缘和中间层。</li>不填写时，默认值为 default。
注意事项：
1.预热至边缘产生的边缘层流量，会计入计费流量；
2.边缘预热默认分配单独的预热额度 1000 条/天，不消费常规预热额度。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 是否对url进行encode，若内容含有非 ASCII 字符集的字符，请开启此开关进行编码转换（编码规则遵循 RFC3986）。
    */
    @SerializedName("EncodeUrl")
    @Expose
    private Boolean EncodeUrl;

    /**
    * 若需要携带 HTTP 头部信息预热，可入参该参数，否则放空即可。
    */
    @SerializedName("Headers")
    @Expose
    private Header [] Headers;

    /**
    * 媒体分片预热控制，取值有：
<li>on：开启分片预热，预热描述文件，并递归解析描述文件分片进行预热；</li>
<li>off：仅预热提交的描述文件；</li>不填写时，默认值为 off。
注意事项：
1. 支持的描述文件为 M3U8，对应分片为 TS；
2. 要求描述文件能正常请求，并按行业标准描述分片路径；
3. 递归解析深度不超过 3 层；
4. 解析获取的分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
    */
    @SerializedName("PrefetchMediaSegments")
    @Expose
    private String PrefetchMediaSegments;

    /**
     * Get 站点 ID。
若您希望快速提交不同站点下的 Targets Url，可以将其填写为 *，但前提是调用该 API 的账号必须具备主账号下全部站点资源的权限。 
     * @return ZoneId 站点 ID。
若您希望快速提交不同站点下的 Targets Url，可以将其填写为 *，但前提是调用该 API 的账号必须具备主账号下全部站点资源的权限。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
若您希望快速提交不同站点下的 Targets Url，可以将其填写为 *，但前提是调用该 API 的账号必须具备主账号下全部站点资源的权限。
     * @param ZoneId 站点 ID。
若您希望快速提交不同站点下的 Targets Url，可以将其填写为 *，但前提是调用该 API 的账号必须具备主账号下全部站点资源的权限。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 要预热的资源列表，必填。每个元素格式类似如下:
http://www.example.com/example.txt。
注意：提交任务数受计费套餐配额限制，请查看 [EO计费套餐](https://cloud.tencent.com/document/product/1552/77380)。 
     * @return Targets 要预热的资源列表，必填。每个元素格式类似如下:
http://www.example.com/example.txt。
注意：提交任务数受计费套餐配额限制，请查看 [EO计费套餐](https://cloud.tencent.com/document/product/1552/77380)。
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 要预热的资源列表，必填。每个元素格式类似如下:
http://www.example.com/example.txt。
注意：提交任务数受计费套餐配额限制，请查看 [EO计费套餐](https://cloud.tencent.com/document/product/1552/77380)。
     * @param Targets 要预热的资源列表，必填。每个元素格式类似如下:
http://www.example.com/example.txt。
注意：提交任务数受计费套餐配额限制，请查看 [EO计费套餐](https://cloud.tencent.com/document/product/1552/77380)。
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 预热模式，取值有：
<li>default：默认模式，即预热到中间层；</li>
<li>edge：边缘预热模式，即预热到边缘和中间层。</li>不填写时，默认值为 default。
注意事项：
1.预热至边缘产生的边缘层流量，会计入计费流量；
2.边缘预热默认分配单独的预热额度 1000 条/天，不消费常规预热额度。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。 
     * @return Mode 预热模式，取值有：
<li>default：默认模式，即预热到中间层；</li>
<li>edge：边缘预热模式，即预热到边缘和中间层。</li>不填写时，默认值为 default。
注意事项：
1.预热至边缘产生的边缘层流量，会计入计费流量；
2.边缘预热默认分配单独的预热额度 1000 条/天，不消费常规预热额度。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 预热模式，取值有：
<li>default：默认模式，即预热到中间层；</li>
<li>edge：边缘预热模式，即预热到边缘和中间层。</li>不填写时，默认值为 default。
注意事项：
1.预热至边缘产生的边缘层流量，会计入计费流量；
2.边缘预热默认分配单独的预热额度 1000 条/天，不消费常规预热额度。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
     * @param Mode 预热模式，取值有：
<li>default：默认模式，即预热到中间层；</li>
<li>edge：边缘预热模式，即预热到边缘和中间层。</li>不填写时，默认值为 default。
注意事项：
1.预热至边缘产生的边缘层流量，会计入计费流量；
2.边缘预热默认分配单独的预热额度 1000 条/天，不消费常规预热额度。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 是否对url进行encode，若内容含有非 ASCII 字符集的字符，请开启此开关进行编码转换（编码规则遵循 RFC3986）。 
     * @return EncodeUrl 是否对url进行encode，若内容含有非 ASCII 字符集的字符，请开启此开关进行编码转换（编码规则遵循 RFC3986）。
     * @deprecated
     */
    @Deprecated
    public Boolean getEncodeUrl() {
        return this.EncodeUrl;
    }

    /**
     * Set 是否对url进行encode，若内容含有非 ASCII 字符集的字符，请开启此开关进行编码转换（编码规则遵循 RFC3986）。
     * @param EncodeUrl 是否对url进行encode，若内容含有非 ASCII 字符集的字符，请开启此开关进行编码转换（编码规则遵循 RFC3986）。
     * @deprecated
     */
    @Deprecated
    public void setEncodeUrl(Boolean EncodeUrl) {
        this.EncodeUrl = EncodeUrl;
    }

    /**
     * Get 若需要携带 HTTP 头部信息预热，可入参该参数，否则放空即可。 
     * @return Headers 若需要携带 HTTP 头部信息预热，可入参该参数，否则放空即可。
     */
    public Header [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 若需要携带 HTTP 头部信息预热，可入参该参数，否则放空即可。
     * @param Headers 若需要携带 HTTP 头部信息预热，可入参该参数，否则放空即可。
     */
    public void setHeaders(Header [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 媒体分片预热控制，取值有：
<li>on：开启分片预热，预热描述文件，并递归解析描述文件分片进行预热；</li>
<li>off：仅预热提交的描述文件；</li>不填写时，默认值为 off。
注意事项：
1. 支持的描述文件为 M3U8，对应分片为 TS；
2. 要求描述文件能正常请求，并按行业标准描述分片路径；
3. 递归解析深度不超过 3 层；
4. 解析获取的分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。 
     * @return PrefetchMediaSegments 媒体分片预热控制，取值有：
<li>on：开启分片预热，预热描述文件，并递归解析描述文件分片进行预热；</li>
<li>off：仅预热提交的描述文件；</li>不填写时，默认值为 off。
注意事项：
1. 支持的描述文件为 M3U8，对应分片为 TS；
2. 要求描述文件能正常请求，并按行业标准描述分片路径；
3. 递归解析深度不超过 3 层；
4. 解析获取的分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
     */
    public String getPrefetchMediaSegments() {
        return this.PrefetchMediaSegments;
    }

    /**
     * Set 媒体分片预热控制，取值有：
<li>on：开启分片预热，预热描述文件，并递归解析描述文件分片进行预热；</li>
<li>off：仅预热提交的描述文件；</li>不填写时，默认值为 off。
注意事项：
1. 支持的描述文件为 M3U8，对应分片为 TS；
2. 要求描述文件能正常请求，并按行业标准描述分片路径；
3. 递归解析深度不超过 3 层；
4. 解析获取的分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
     * @param PrefetchMediaSegments 媒体分片预热控制，取值有：
<li>on：开启分片预热，预热描述文件，并递归解析描述文件分片进行预热；</li>
<li>off：仅预热提交的描述文件；</li>不填写时，默认值为 off。
注意事项：
1. 支持的描述文件为 M3U8，对应分片为 TS；
2. 要求描述文件能正常请求，并按行业标准描述分片路径；
3. 递归解析深度不超过 3 层；
4. 解析获取的分片会正常累加每日预热用量，当用量超出配额时，会静默处理，不再执行预热。
说明：
该参数为白名单功能，如有需要，请联系腾讯云工程师处理。
     */
    public void setPrefetchMediaSegments(String PrefetchMediaSegments) {
        this.PrefetchMediaSegments = PrefetchMediaSegments;
    }

    public CreatePrefetchTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrefetchTaskRequest(CreatePrefetchTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.EncodeUrl != null) {
            this.EncodeUrl = new Boolean(source.EncodeUrl);
        }
        if (source.Headers != null) {
            this.Headers = new Header[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new Header(source.Headers[i]);
            }
        }
        if (source.PrefetchMediaSegments != null) {
            this.PrefetchMediaSegments = new String(source.PrefetchMediaSegments);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "EncodeUrl", this.EncodeUrl);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "PrefetchMediaSegments", this.PrefetchMediaSegments);

    }
}

