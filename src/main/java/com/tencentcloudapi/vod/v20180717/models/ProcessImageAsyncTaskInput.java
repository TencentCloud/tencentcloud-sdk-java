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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessImageAsyncTaskInput extends AbstractModel {

    /**
    * <p>图片异步处理模板ID。可使用自定义模板ID，也可使用下列预制模板：</p><table><thead><tr><th align="right">模板编号（Definition）</th><th>模板名称</th><th>功能说明</th></tr></thead><tbody><tr><td align="right">14</td><td>图片理解</td><td>图片内容分析、辅助分类与检索</td></tr><tr><td align="right">15</td><td>AI擦除</td><td>图片中文字或水印的擦除</td></tr><tr><td align="right">16</td><td>图片修复</td><td>图片修复与瑕疵处理，老照片修复</td></tr><tr><td align="right">17</td><td>AI抠图</td><td>主体抠图、背景替换前的素材准备</td></tr><tr><td align="right">19</td><td>图片美颜</td><td>人像照片美化</td></tr><tr><td align="right">20</td><td>通用抠图</td><td>商品或主体前景提取、素材合成</td></tr><tr><td align="right">22</td><td>图片超分至4K</td><td>图片超分-超分至4K-ultra（短边2160，长边自适应），可用于优化图片清晰度、高分辨率展示、大屏素材准备</td></tr><tr><td align="right">23</td><td>图片超分至2K</td><td>图片超分-超分至2K-ultra（短边1440，长边自适应），可用于优化图片清晰度、高分辨率图片展示、素材清晰度提升</td></tr><tr><td align="right">25</td><td>图片压缩75质量</td><td>图片压缩-75%质量-JPEG，可用于网页配图、缩略图等需要控制文件体积的场景</td></tr><tr><td align="right">27</td><td>图片超分两倍超分</td><td>图片超分-两倍超分-ultra，可用于小尺寸图片放大、提高展示分辨率与清晰度</td></tr></tbody></table>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>图片异步处理扩展参数。</p>
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private ProcessImageAsyncInputExtendedParameter ExtendedParameter;

    /**
     * Get <p>图片异步处理模板ID。可使用自定义模板ID，也可使用下列预制模板：</p><table><thead><tr><th align="right">模板编号（Definition）</th><th>模板名称</th><th>功能说明</th></tr></thead><tbody><tr><td align="right">14</td><td>图片理解</td><td>图片内容分析、辅助分类与检索</td></tr><tr><td align="right">15</td><td>AI擦除</td><td>图片中文字或水印的擦除</td></tr><tr><td align="right">16</td><td>图片修复</td><td>图片修复与瑕疵处理，老照片修复</td></tr><tr><td align="right">17</td><td>AI抠图</td><td>主体抠图、背景替换前的素材准备</td></tr><tr><td align="right">19</td><td>图片美颜</td><td>人像照片美化</td></tr><tr><td align="right">20</td><td>通用抠图</td><td>商品或主体前景提取、素材合成</td></tr><tr><td align="right">22</td><td>图片超分至4K</td><td>图片超分-超分至4K-ultra（短边2160，长边自适应），可用于优化图片清晰度、高分辨率展示、大屏素材准备</td></tr><tr><td align="right">23</td><td>图片超分至2K</td><td>图片超分-超分至2K-ultra（短边1440，长边自适应），可用于优化图片清晰度、高分辨率图片展示、素材清晰度提升</td></tr><tr><td align="right">25</td><td>图片压缩75质量</td><td>图片压缩-75%质量-JPEG，可用于网页配图、缩略图等需要控制文件体积的场景</td></tr><tr><td align="right">27</td><td>图片超分两倍超分</td><td>图片超分-两倍超分-ultra，可用于小尺寸图片放大、提高展示分辨率与清晰度</td></tr></tbody></table> 
     * @return Definition <p>图片异步处理模板ID。可使用自定义模板ID，也可使用下列预制模板：</p><table><thead><tr><th align="right">模板编号（Definition）</th><th>模板名称</th><th>功能说明</th></tr></thead><tbody><tr><td align="right">14</td><td>图片理解</td><td>图片内容分析、辅助分类与检索</td></tr><tr><td align="right">15</td><td>AI擦除</td><td>图片中文字或水印的擦除</td></tr><tr><td align="right">16</td><td>图片修复</td><td>图片修复与瑕疵处理，老照片修复</td></tr><tr><td align="right">17</td><td>AI抠图</td><td>主体抠图、背景替换前的素材准备</td></tr><tr><td align="right">19</td><td>图片美颜</td><td>人像照片美化</td></tr><tr><td align="right">20</td><td>通用抠图</td><td>商品或主体前景提取、素材合成</td></tr><tr><td align="right">22</td><td>图片超分至4K</td><td>图片超分-超分至4K-ultra（短边2160，长边自适应），可用于优化图片清晰度、高分辨率展示、大屏素材准备</td></tr><tr><td align="right">23</td><td>图片超分至2K</td><td>图片超分-超分至2K-ultra（短边1440，长边自适应），可用于优化图片清晰度、高分辨率图片展示、素材清晰度提升</td></tr><tr><td align="right">25</td><td>图片压缩75质量</td><td>图片压缩-75%质量-JPEG，可用于网页配图、缩略图等需要控制文件体积的场景</td></tr><tr><td align="right">27</td><td>图片超分两倍超分</td><td>图片超分-两倍超分-ultra，可用于小尺寸图片放大、提高展示分辨率与清晰度</td></tr></tbody></table>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>图片异步处理模板ID。可使用自定义模板ID，也可使用下列预制模板：</p><table><thead><tr><th align="right">模板编号（Definition）</th><th>模板名称</th><th>功能说明</th></tr></thead><tbody><tr><td align="right">14</td><td>图片理解</td><td>图片内容分析、辅助分类与检索</td></tr><tr><td align="right">15</td><td>AI擦除</td><td>图片中文字或水印的擦除</td></tr><tr><td align="right">16</td><td>图片修复</td><td>图片修复与瑕疵处理，老照片修复</td></tr><tr><td align="right">17</td><td>AI抠图</td><td>主体抠图、背景替换前的素材准备</td></tr><tr><td align="right">19</td><td>图片美颜</td><td>人像照片美化</td></tr><tr><td align="right">20</td><td>通用抠图</td><td>商品或主体前景提取、素材合成</td></tr><tr><td align="right">22</td><td>图片超分至4K</td><td>图片超分-超分至4K-ultra（短边2160，长边自适应），可用于优化图片清晰度、高分辨率展示、大屏素材准备</td></tr><tr><td align="right">23</td><td>图片超分至2K</td><td>图片超分-超分至2K-ultra（短边1440，长边自适应），可用于优化图片清晰度、高分辨率图片展示、素材清晰度提升</td></tr><tr><td align="right">25</td><td>图片压缩75质量</td><td>图片压缩-75%质量-JPEG，可用于网页配图、缩略图等需要控制文件体积的场景</td></tr><tr><td align="right">27</td><td>图片超分两倍超分</td><td>图片超分-两倍超分-ultra，可用于小尺寸图片放大、提高展示分辨率与清晰度</td></tr></tbody></table>
     * @param Definition <p>图片异步处理模板ID。可使用自定义模板ID，也可使用下列预制模板：</p><table><thead><tr><th align="right">模板编号（Definition）</th><th>模板名称</th><th>功能说明</th></tr></thead><tbody><tr><td align="right">14</td><td>图片理解</td><td>图片内容分析、辅助分类与检索</td></tr><tr><td align="right">15</td><td>AI擦除</td><td>图片中文字或水印的擦除</td></tr><tr><td align="right">16</td><td>图片修复</td><td>图片修复与瑕疵处理，老照片修复</td></tr><tr><td align="right">17</td><td>AI抠图</td><td>主体抠图、背景替换前的素材准备</td></tr><tr><td align="right">19</td><td>图片美颜</td><td>人像照片美化</td></tr><tr><td align="right">20</td><td>通用抠图</td><td>商品或主体前景提取、素材合成</td></tr><tr><td align="right">22</td><td>图片超分至4K</td><td>图片超分-超分至4K-ultra（短边2160，长边自适应），可用于优化图片清晰度、高分辨率展示、大屏素材准备</td></tr><tr><td align="right">23</td><td>图片超分至2K</td><td>图片超分-超分至2K-ultra（短边1440，长边自适应），可用于优化图片清晰度、高分辨率图片展示、素材清晰度提升</td></tr><tr><td align="right">25</td><td>图片压缩75质量</td><td>图片压缩-75%质量-JPEG，可用于网页配图、缩略图等需要控制文件体积的场景</td></tr><tr><td align="right">27</td><td>图片超分两倍超分</td><td>图片超分-两倍超分-ultra，可用于小尺寸图片放大、提高展示分辨率与清晰度</td></tr></tbody></table>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>图片异步处理扩展参数。</p> 
     * @return ExtendedParameter <p>图片异步处理扩展参数。</p>
     */
    public ProcessImageAsyncInputExtendedParameter getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set <p>图片异步处理扩展参数。</p>
     * @param ExtendedParameter <p>图片异步处理扩展参数。</p>
     */
    public void setExtendedParameter(ProcessImageAsyncInputExtendedParameter ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    public ProcessImageAsyncTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncTaskInput(ProcessImageAsyncTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new ProcessImageAsyncInputExtendedParameter(source.ExtendedParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "ExtendedParameter.", this.ExtendedParameter);

    }
}

