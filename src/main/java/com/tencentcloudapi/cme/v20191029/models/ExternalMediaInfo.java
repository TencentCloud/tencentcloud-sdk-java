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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalMediaInfo extends AbstractModel{

    /**
    * 媒资绑定模板 ID，可取值为：
<li>1000000：媒体文件为 URL，且 URL Scheme 为 https；</li>
<li>1000001：媒体文件为 URL，且 URL Scheme 为 http。</li>

注：如果要支持其它存储平台或者类型的媒体绑定，请联系 [客服](https://cloud.tencent.com/online-service?from=doc_1156)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 媒资绑定媒体路径或文件 ID。如果要绑定 URL 类型的媒体，请将 URL 的 <code>'https://'</code> 或者 <code>'http://'</code> 去掉，例如：
原始媒体 URL 为 `https://www.example.com/a.mp4`，则 MediaKey 为 `www.example.com/a.mp4`。
    */
    @SerializedName("MediaKey")
    @Expose
    private String MediaKey;

    /**
     * Get 媒资绑定模板 ID，可取值为：
<li>1000000：媒体文件为 URL，且 URL Scheme 为 https；</li>
<li>1000001：媒体文件为 URL，且 URL Scheme 为 http。</li>

注：如果要支持其它存储平台或者类型的媒体绑定，请联系 [客服](https://cloud.tencent.com/online-service?from=doc_1156)。 
     * @return Definition 媒资绑定模板 ID，可取值为：
<li>1000000：媒体文件为 URL，且 URL Scheme 为 https；</li>
<li>1000001：媒体文件为 URL，且 URL Scheme 为 http。</li>

注：如果要支持其它存储平台或者类型的媒体绑定，请联系 [客服](https://cloud.tencent.com/online-service?from=doc_1156)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 媒资绑定模板 ID，可取值为：
<li>1000000：媒体文件为 URL，且 URL Scheme 为 https；</li>
<li>1000001：媒体文件为 URL，且 URL Scheme 为 http。</li>

注：如果要支持其它存储平台或者类型的媒体绑定，请联系 [客服](https://cloud.tencent.com/online-service?from=doc_1156)。
     * @param Definition 媒资绑定模板 ID，可取值为：
<li>1000000：媒体文件为 URL，且 URL Scheme 为 https；</li>
<li>1000001：媒体文件为 URL，且 URL Scheme 为 http。</li>

注：如果要支持其它存储平台或者类型的媒体绑定，请联系 [客服](https://cloud.tencent.com/online-service?from=doc_1156)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 媒资绑定媒体路径或文件 ID。如果要绑定 URL 类型的媒体，请将 URL 的 <code>'https://'</code> 或者 <code>'http://'</code> 去掉，例如：
原始媒体 URL 为 `https://www.example.com/a.mp4`，则 MediaKey 为 `www.example.com/a.mp4`。 
     * @return MediaKey 媒资绑定媒体路径或文件 ID。如果要绑定 URL 类型的媒体，请将 URL 的 <code>'https://'</code> 或者 <code>'http://'</code> 去掉，例如：
原始媒体 URL 为 `https://www.example.com/a.mp4`，则 MediaKey 为 `www.example.com/a.mp4`。
     */
    public String getMediaKey() {
        return this.MediaKey;
    }

    /**
     * Set 媒资绑定媒体路径或文件 ID。如果要绑定 URL 类型的媒体，请将 URL 的 <code>'https://'</code> 或者 <code>'http://'</code> 去掉，例如：
原始媒体 URL 为 `https://www.example.com/a.mp4`，则 MediaKey 为 `www.example.com/a.mp4`。
     * @param MediaKey 媒资绑定媒体路径或文件 ID。如果要绑定 URL 类型的媒体，请将 URL 的 <code>'https://'</code> 或者 <code>'http://'</code> 去掉，例如：
原始媒体 URL 为 `https://www.example.com/a.mp4`，则 MediaKey 为 `www.example.com/a.mp4`。
     */
    public void setMediaKey(String MediaKey) {
        this.MediaKey = MediaKey;
    }

    public ExternalMediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalMediaInfo(ExternalMediaInfo source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.MediaKey != null) {
            this.MediaKey = new String(source.MediaKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "MediaKey", this.MediaKey);

    }
}

