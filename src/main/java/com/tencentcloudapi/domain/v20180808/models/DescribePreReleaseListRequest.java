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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePreReleaseListRequest extends AbstractModel {

    /**
    * 单独使用Keywords：使用域名关键词进行搜索
Keywords+DomainStart（true）：使用域名开头关键词进行搜索
Keywords+DomainEnd（true）：使用域名结尾关键词进行搜索
Keywords+DomainStart（true）+DomainEnd（true）：使用域名开头或结尾关键词进行搜索
    */
    @SerializedName("Keywords")
    @Expose
    private String Keywords;

    /**
    * 是否以域名开头关键词进行搜索
true：是
false：否
    */
    @SerializedName("DomainStart")
    @Expose
    private Boolean DomainStart;

    /**
    * 是否以域名结尾关键词进行搜索
true：是
false：否
    */
    @SerializedName("DomainEnd")
    @Expose
    private Boolean DomainEnd;

    /**
    * 不同排序规则：
1： 价格升序
2： 价格降序
3： 域名升序
4： 结束时间升序
5： 店铺推荐升序
6： 结束时间降序
15:  创建时间升序
其他：结束时间升序
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * 起始价格
    */
    @SerializedName("PriceStart")
    @Expose
    private Float PriceStart;

    /**
    * 结束价格
    */
    @SerializedName("PriceEnd")
    @Expose
    private Float PriceEnd;

    /**
    * 起始域名长度
    */
    @SerializedName("LengthStart")
    @Expose
    private Long LengthStart;

    /**
    * 结束域名长度
    */
    @SerializedName("LengthEnd")
    @Expose
    private Long LengthEnd;

    /**
    * 页码（默认为1）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示数（默认为20）
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 后缀
1="com"
2="net"
4="biz"
6="info"
7="co"
9="cn"
10="com.cn"
11="wang"
12="vip"
13="cc"
14="net.cn"
15="org.cn"
16="top"
17="asia"
18="tv"
19="club"
20="shop"
21 ="中国"
23="online"
24="xyz"
25="网店"
26="网址"
27="在线"
28="ltd"
29="fans"
30="ren"
31="icu"
    */
    @SerializedName("Suffix")
    @Expose
    private Long [] Suffix;

    /**
    * 一级分类
1:"纯数字"
2:"单数字"
3:"双数字"
4:"三数字"
5:"四数字"
6:"五数字"
7:"六数字"
9:"单字母"
10:"双字母"
11:"三字母"
12:"四字母"
13:"五字母"
14:"单拼"
15:"双拼"
16:"三拼"
17:"杂米"
18:"两杂"
19:"三杂"
20:"四杂"

    */
    @SerializedName("ClassOne")
    @Expose
    private Long ClassOne;

    /**
    * 二级分类
13:"0开或带4"
14:"非0开不带4"
15:"不带0,4"
0:"非全声母"
6:"全声母"
16:"不带0,4"
32:"全声母"
5010:"CVCV"
    */
    @SerializedName("ClassTwo")
    @Expose
    private Long [] ClassTwo;

    /**
    * 三级分类
111:"AAA"
401:"3A及以上"
402:"AA结尾"
1122:"AABB"
1123:"AABC"
1212:"ABAB"
1221:"ABBA"
1233:"ABCC"
501:"4A及以上"
502:"3A及以上"
503:"AAA开头"
504:"AAA结尾"
505:"AA开头"
506:"AA结尾"
507:"三顺子开头"
508:"三顺子结尾"
11223:"AABBC"
12233:"ABBCC"
601:"5A及以上"
602:"4A及以上"
603:"3A及以上"
604:"4A开头"
605:"4A结尾"
606:"AAA开头"
607:"AAA结尾"
608:"AA开头"
609:"AA结尾"
610:"ABAB开头"
611:"ABAB结尾"
612:"AABB开头"
613:"AABB结尾"
614:"四顺子开头"
615:"四顺子结尾"
616:"三顺子开头"
617:"三顺子结尾"
121212:"ABABAB"
112233:"AABBCC"
123123:"ABCABC"
211:"LNN"
221:"LLN"
121:"NLN"
212:"LNL"
122:"NLL"
1112:"NNNL"
2111:"LNNN"
1212:"NLNL"
2121:"LNLN"
1222:"NLLL"
2221:"LLLN"
1122:"NNLL"
2211:"LLNN"
31:"W结尾"
112:"AAB"
122:"ABB"
121:"ABA"
41:"W结尾"
1112:"AAAB"
1222:"ABBB"
1122:"AABB"
1212:"ABAB"
    */
    @SerializedName("ClassThree")
    @Expose
    private Long [] ClassThree;

    /**
    * 四级分类
1:"仅含2种数字"
2:"仅含3种数字"
4:"仅含1种字母"
8:"仅含1种数字"

    */
    @SerializedName("ClassFour")
    @Expose
    private Long [] ClassFour;

    /**
    * 是否以域名开头排除关键词进行搜索
    */
    @SerializedName("FilterStart")
    @Expose
    private Boolean FilterStart;

    /**
    * 是否以域名结尾排除关键词进行搜索
    */
    @SerializedName("FilterEnd")
    @Expose
    private Boolean FilterEnd;

    /**
    * 域名排除关键词
单独使用FilterWords：使用排除关键词进行搜索
FilterWords+FilterStart（true）：使用域名开头排除关键词进行搜索
FilterWords+FilterEnd（true）：使用域名结尾排除关键词进行搜索
FilterWords+FilterStart（true）+FilterEnd（true）：使用域名开头或结尾排除关键词进行搜索
    */
    @SerializedName("FilterWords")
    @Expose
    private String FilterWords;

    /**
    * 交易类型（目前只支持10）
10: 预释放域名
    */
    @SerializedName("TransType")
    @Expose
    private Long TransType;

    /**
    * 是否搜索白金域名（默认值为false）
    */
    @SerializedName("IsTop")
    @Expose
    private Boolean IsTop;

    /**
    * 结束时间排序 desc:倒序 asc:正序
    */
    @SerializedName("EndTimeSort")
    @Expose
    private String EndTimeSort;

    /**
    * 结束时间（YYYY-MM-DD）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 单独使用Keywords：使用域名关键词进行搜索
Keywords+DomainStart（true）：使用域名开头关键词进行搜索
Keywords+DomainEnd（true）：使用域名结尾关键词进行搜索
Keywords+DomainStart（true）+DomainEnd（true）：使用域名开头或结尾关键词进行搜索 
     * @return Keywords 单独使用Keywords：使用域名关键词进行搜索
Keywords+DomainStart（true）：使用域名开头关键词进行搜索
Keywords+DomainEnd（true）：使用域名结尾关键词进行搜索
Keywords+DomainStart（true）+DomainEnd（true）：使用域名开头或结尾关键词进行搜索
     */
    public String getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 单独使用Keywords：使用域名关键词进行搜索
Keywords+DomainStart（true）：使用域名开头关键词进行搜索
Keywords+DomainEnd（true）：使用域名结尾关键词进行搜索
Keywords+DomainStart（true）+DomainEnd（true）：使用域名开头或结尾关键词进行搜索
     * @param Keywords 单独使用Keywords：使用域名关键词进行搜索
Keywords+DomainStart（true）：使用域名开头关键词进行搜索
Keywords+DomainEnd（true）：使用域名结尾关键词进行搜索
Keywords+DomainStart（true）+DomainEnd（true）：使用域名开头或结尾关键词进行搜索
     */
    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 是否以域名开头关键词进行搜索
true：是
false：否 
     * @return DomainStart 是否以域名开头关键词进行搜索
true：是
false：否
     */
    public Boolean getDomainStart() {
        return this.DomainStart;
    }

    /**
     * Set 是否以域名开头关键词进行搜索
true：是
false：否
     * @param DomainStart 是否以域名开头关键词进行搜索
true：是
false：否
     */
    public void setDomainStart(Boolean DomainStart) {
        this.DomainStart = DomainStart;
    }

    /**
     * Get 是否以域名结尾关键词进行搜索
true：是
false：否 
     * @return DomainEnd 是否以域名结尾关键词进行搜索
true：是
false：否
     */
    public Boolean getDomainEnd() {
        return this.DomainEnd;
    }

    /**
     * Set 是否以域名结尾关键词进行搜索
true：是
false：否
     * @param DomainEnd 是否以域名结尾关键词进行搜索
true：是
false：否
     */
    public void setDomainEnd(Boolean DomainEnd) {
        this.DomainEnd = DomainEnd;
    }

    /**
     * Get 不同排序规则：
1： 价格升序
2： 价格降序
3： 域名升序
4： 结束时间升序
5： 店铺推荐升序
6： 结束时间降序
15:  创建时间升序
其他：结束时间升序 
     * @return Sort 不同排序规则：
1： 价格升序
2： 价格降序
3： 域名升序
4： 结束时间升序
5： 店铺推荐升序
6： 结束时间降序
15:  创建时间升序
其他：结束时间升序
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 不同排序规则：
1： 价格升序
2： 价格降序
3： 域名升序
4： 结束时间升序
5： 店铺推荐升序
6： 结束时间降序
15:  创建时间升序
其他：结束时间升序
     * @param Sort 不同排序规则：
1： 价格升序
2： 价格降序
3： 域名升序
4： 结束时间升序
5： 店铺推荐升序
6： 结束时间降序
15:  创建时间升序
其他：结束时间升序
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 起始价格 
     * @return PriceStart 起始价格
     */
    public Float getPriceStart() {
        return this.PriceStart;
    }

    /**
     * Set 起始价格
     * @param PriceStart 起始价格
     */
    public void setPriceStart(Float PriceStart) {
        this.PriceStart = PriceStart;
    }

    /**
     * Get 结束价格 
     * @return PriceEnd 结束价格
     */
    public Float getPriceEnd() {
        return this.PriceEnd;
    }

    /**
     * Set 结束价格
     * @param PriceEnd 结束价格
     */
    public void setPriceEnd(Float PriceEnd) {
        this.PriceEnd = PriceEnd;
    }

    /**
     * Get 起始域名长度 
     * @return LengthStart 起始域名长度
     */
    public Long getLengthStart() {
        return this.LengthStart;
    }

    /**
     * Set 起始域名长度
     * @param LengthStart 起始域名长度
     */
    public void setLengthStart(Long LengthStart) {
        this.LengthStart = LengthStart;
    }

    /**
     * Get 结束域名长度 
     * @return LengthEnd 结束域名长度
     */
    public Long getLengthEnd() {
        return this.LengthEnd;
    }

    /**
     * Set 结束域名长度
     * @param LengthEnd 结束域名长度
     */
    public void setLengthEnd(Long LengthEnd) {
        this.LengthEnd = LengthEnd;
    }

    /**
     * Get 页码（默认为1） 
     * @return PageNumber 页码（默认为1）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码（默认为1）
     * @param PageNumber 页码（默认为1）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示数（默认为20） 
     * @return PageSize 每页显示数（默认为20）
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示数（默认为20）
     * @param PageSize 每页显示数（默认为20）
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 后缀
1="com"
2="net"
4="biz"
6="info"
7="co"
9="cn"
10="com.cn"
11="wang"
12="vip"
13="cc"
14="net.cn"
15="org.cn"
16="top"
17="asia"
18="tv"
19="club"
20="shop"
21 ="中国"
23="online"
24="xyz"
25="网店"
26="网址"
27="在线"
28="ltd"
29="fans"
30="ren"
31="icu" 
     * @return Suffix 后缀
1="com"
2="net"
4="biz"
6="info"
7="co"
9="cn"
10="com.cn"
11="wang"
12="vip"
13="cc"
14="net.cn"
15="org.cn"
16="top"
17="asia"
18="tv"
19="club"
20="shop"
21 ="中国"
23="online"
24="xyz"
25="网店"
26="网址"
27="在线"
28="ltd"
29="fans"
30="ren"
31="icu"
     */
    public Long [] getSuffix() {
        return this.Suffix;
    }

    /**
     * Set 后缀
1="com"
2="net"
4="biz"
6="info"
7="co"
9="cn"
10="com.cn"
11="wang"
12="vip"
13="cc"
14="net.cn"
15="org.cn"
16="top"
17="asia"
18="tv"
19="club"
20="shop"
21 ="中国"
23="online"
24="xyz"
25="网店"
26="网址"
27="在线"
28="ltd"
29="fans"
30="ren"
31="icu"
     * @param Suffix 后缀
1="com"
2="net"
4="biz"
6="info"
7="co"
9="cn"
10="com.cn"
11="wang"
12="vip"
13="cc"
14="net.cn"
15="org.cn"
16="top"
17="asia"
18="tv"
19="club"
20="shop"
21 ="中国"
23="online"
24="xyz"
25="网店"
26="网址"
27="在线"
28="ltd"
29="fans"
30="ren"
31="icu"
     */
    public void setSuffix(Long [] Suffix) {
        this.Suffix = Suffix;
    }

    /**
     * Get 一级分类
1:"纯数字"
2:"单数字"
3:"双数字"
4:"三数字"
5:"四数字"
6:"五数字"
7:"六数字"
9:"单字母"
10:"双字母"
11:"三字母"
12:"四字母"
13:"五字母"
14:"单拼"
15:"双拼"
16:"三拼"
17:"杂米"
18:"两杂"
19:"三杂"
20:"四杂"
 
     * @return ClassOne 一级分类
1:"纯数字"
2:"单数字"
3:"双数字"
4:"三数字"
5:"四数字"
6:"五数字"
7:"六数字"
9:"单字母"
10:"双字母"
11:"三字母"
12:"四字母"
13:"五字母"
14:"单拼"
15:"双拼"
16:"三拼"
17:"杂米"
18:"两杂"
19:"三杂"
20:"四杂"

     */
    public Long getClassOne() {
        return this.ClassOne;
    }

    /**
     * Set 一级分类
1:"纯数字"
2:"单数字"
3:"双数字"
4:"三数字"
5:"四数字"
6:"五数字"
7:"六数字"
9:"单字母"
10:"双字母"
11:"三字母"
12:"四字母"
13:"五字母"
14:"单拼"
15:"双拼"
16:"三拼"
17:"杂米"
18:"两杂"
19:"三杂"
20:"四杂"

     * @param ClassOne 一级分类
1:"纯数字"
2:"单数字"
3:"双数字"
4:"三数字"
5:"四数字"
6:"五数字"
7:"六数字"
9:"单字母"
10:"双字母"
11:"三字母"
12:"四字母"
13:"五字母"
14:"单拼"
15:"双拼"
16:"三拼"
17:"杂米"
18:"两杂"
19:"三杂"
20:"四杂"

     */
    public void setClassOne(Long ClassOne) {
        this.ClassOne = ClassOne;
    }

    /**
     * Get 二级分类
13:"0开或带4"
14:"非0开不带4"
15:"不带0,4"
0:"非全声母"
6:"全声母"
16:"不带0,4"
32:"全声母"
5010:"CVCV" 
     * @return ClassTwo 二级分类
13:"0开或带4"
14:"非0开不带4"
15:"不带0,4"
0:"非全声母"
6:"全声母"
16:"不带0,4"
32:"全声母"
5010:"CVCV"
     */
    public Long [] getClassTwo() {
        return this.ClassTwo;
    }

    /**
     * Set 二级分类
13:"0开或带4"
14:"非0开不带4"
15:"不带0,4"
0:"非全声母"
6:"全声母"
16:"不带0,4"
32:"全声母"
5010:"CVCV"
     * @param ClassTwo 二级分类
13:"0开或带4"
14:"非0开不带4"
15:"不带0,4"
0:"非全声母"
6:"全声母"
16:"不带0,4"
32:"全声母"
5010:"CVCV"
     */
    public void setClassTwo(Long [] ClassTwo) {
        this.ClassTwo = ClassTwo;
    }

    /**
     * Get 三级分类
111:"AAA"
401:"3A及以上"
402:"AA结尾"
1122:"AABB"
1123:"AABC"
1212:"ABAB"
1221:"ABBA"
1233:"ABCC"
501:"4A及以上"
502:"3A及以上"
503:"AAA开头"
504:"AAA结尾"
505:"AA开头"
506:"AA结尾"
507:"三顺子开头"
508:"三顺子结尾"
11223:"AABBC"
12233:"ABBCC"
601:"5A及以上"
602:"4A及以上"
603:"3A及以上"
604:"4A开头"
605:"4A结尾"
606:"AAA开头"
607:"AAA结尾"
608:"AA开头"
609:"AA结尾"
610:"ABAB开头"
611:"ABAB结尾"
612:"AABB开头"
613:"AABB结尾"
614:"四顺子开头"
615:"四顺子结尾"
616:"三顺子开头"
617:"三顺子结尾"
121212:"ABABAB"
112233:"AABBCC"
123123:"ABCABC"
211:"LNN"
221:"LLN"
121:"NLN"
212:"LNL"
122:"NLL"
1112:"NNNL"
2111:"LNNN"
1212:"NLNL"
2121:"LNLN"
1222:"NLLL"
2221:"LLLN"
1122:"NNLL"
2211:"LLNN"
31:"W结尾"
112:"AAB"
122:"ABB"
121:"ABA"
41:"W结尾"
1112:"AAAB"
1222:"ABBB"
1122:"AABB"
1212:"ABAB" 
     * @return ClassThree 三级分类
111:"AAA"
401:"3A及以上"
402:"AA结尾"
1122:"AABB"
1123:"AABC"
1212:"ABAB"
1221:"ABBA"
1233:"ABCC"
501:"4A及以上"
502:"3A及以上"
503:"AAA开头"
504:"AAA结尾"
505:"AA开头"
506:"AA结尾"
507:"三顺子开头"
508:"三顺子结尾"
11223:"AABBC"
12233:"ABBCC"
601:"5A及以上"
602:"4A及以上"
603:"3A及以上"
604:"4A开头"
605:"4A结尾"
606:"AAA开头"
607:"AAA结尾"
608:"AA开头"
609:"AA结尾"
610:"ABAB开头"
611:"ABAB结尾"
612:"AABB开头"
613:"AABB结尾"
614:"四顺子开头"
615:"四顺子结尾"
616:"三顺子开头"
617:"三顺子结尾"
121212:"ABABAB"
112233:"AABBCC"
123123:"ABCABC"
211:"LNN"
221:"LLN"
121:"NLN"
212:"LNL"
122:"NLL"
1112:"NNNL"
2111:"LNNN"
1212:"NLNL"
2121:"LNLN"
1222:"NLLL"
2221:"LLLN"
1122:"NNLL"
2211:"LLNN"
31:"W结尾"
112:"AAB"
122:"ABB"
121:"ABA"
41:"W结尾"
1112:"AAAB"
1222:"ABBB"
1122:"AABB"
1212:"ABAB"
     */
    public Long [] getClassThree() {
        return this.ClassThree;
    }

    /**
     * Set 三级分类
111:"AAA"
401:"3A及以上"
402:"AA结尾"
1122:"AABB"
1123:"AABC"
1212:"ABAB"
1221:"ABBA"
1233:"ABCC"
501:"4A及以上"
502:"3A及以上"
503:"AAA开头"
504:"AAA结尾"
505:"AA开头"
506:"AA结尾"
507:"三顺子开头"
508:"三顺子结尾"
11223:"AABBC"
12233:"ABBCC"
601:"5A及以上"
602:"4A及以上"
603:"3A及以上"
604:"4A开头"
605:"4A结尾"
606:"AAA开头"
607:"AAA结尾"
608:"AA开头"
609:"AA结尾"
610:"ABAB开头"
611:"ABAB结尾"
612:"AABB开头"
613:"AABB结尾"
614:"四顺子开头"
615:"四顺子结尾"
616:"三顺子开头"
617:"三顺子结尾"
121212:"ABABAB"
112233:"AABBCC"
123123:"ABCABC"
211:"LNN"
221:"LLN"
121:"NLN"
212:"LNL"
122:"NLL"
1112:"NNNL"
2111:"LNNN"
1212:"NLNL"
2121:"LNLN"
1222:"NLLL"
2221:"LLLN"
1122:"NNLL"
2211:"LLNN"
31:"W结尾"
112:"AAB"
122:"ABB"
121:"ABA"
41:"W结尾"
1112:"AAAB"
1222:"ABBB"
1122:"AABB"
1212:"ABAB"
     * @param ClassThree 三级分类
111:"AAA"
401:"3A及以上"
402:"AA结尾"
1122:"AABB"
1123:"AABC"
1212:"ABAB"
1221:"ABBA"
1233:"ABCC"
501:"4A及以上"
502:"3A及以上"
503:"AAA开头"
504:"AAA结尾"
505:"AA开头"
506:"AA结尾"
507:"三顺子开头"
508:"三顺子结尾"
11223:"AABBC"
12233:"ABBCC"
601:"5A及以上"
602:"4A及以上"
603:"3A及以上"
604:"4A开头"
605:"4A结尾"
606:"AAA开头"
607:"AAA结尾"
608:"AA开头"
609:"AA结尾"
610:"ABAB开头"
611:"ABAB结尾"
612:"AABB开头"
613:"AABB结尾"
614:"四顺子开头"
615:"四顺子结尾"
616:"三顺子开头"
617:"三顺子结尾"
121212:"ABABAB"
112233:"AABBCC"
123123:"ABCABC"
211:"LNN"
221:"LLN"
121:"NLN"
212:"LNL"
122:"NLL"
1112:"NNNL"
2111:"LNNN"
1212:"NLNL"
2121:"LNLN"
1222:"NLLL"
2221:"LLLN"
1122:"NNLL"
2211:"LLNN"
31:"W结尾"
112:"AAB"
122:"ABB"
121:"ABA"
41:"W结尾"
1112:"AAAB"
1222:"ABBB"
1122:"AABB"
1212:"ABAB"
     */
    public void setClassThree(Long [] ClassThree) {
        this.ClassThree = ClassThree;
    }

    /**
     * Get 四级分类
1:"仅含2种数字"
2:"仅含3种数字"
4:"仅含1种字母"
8:"仅含1种数字"
 
     * @return ClassFour 四级分类
1:"仅含2种数字"
2:"仅含3种数字"
4:"仅含1种字母"
8:"仅含1种数字"

     */
    public Long [] getClassFour() {
        return this.ClassFour;
    }

    /**
     * Set 四级分类
1:"仅含2种数字"
2:"仅含3种数字"
4:"仅含1种字母"
8:"仅含1种数字"

     * @param ClassFour 四级分类
1:"仅含2种数字"
2:"仅含3种数字"
4:"仅含1种字母"
8:"仅含1种数字"

     */
    public void setClassFour(Long [] ClassFour) {
        this.ClassFour = ClassFour;
    }

    /**
     * Get 是否以域名开头排除关键词进行搜索 
     * @return FilterStart 是否以域名开头排除关键词进行搜索
     */
    public Boolean getFilterStart() {
        return this.FilterStart;
    }

    /**
     * Set 是否以域名开头排除关键词进行搜索
     * @param FilterStart 是否以域名开头排除关键词进行搜索
     */
    public void setFilterStart(Boolean FilterStart) {
        this.FilterStart = FilterStart;
    }

    /**
     * Get 是否以域名结尾排除关键词进行搜索 
     * @return FilterEnd 是否以域名结尾排除关键词进行搜索
     */
    public Boolean getFilterEnd() {
        return this.FilterEnd;
    }

    /**
     * Set 是否以域名结尾排除关键词进行搜索
     * @param FilterEnd 是否以域名结尾排除关键词进行搜索
     */
    public void setFilterEnd(Boolean FilterEnd) {
        this.FilterEnd = FilterEnd;
    }

    /**
     * Get 域名排除关键词
单独使用FilterWords：使用排除关键词进行搜索
FilterWords+FilterStart（true）：使用域名开头排除关键词进行搜索
FilterWords+FilterEnd（true）：使用域名结尾排除关键词进行搜索
FilterWords+FilterStart（true）+FilterEnd（true）：使用域名开头或结尾排除关键词进行搜索 
     * @return FilterWords 域名排除关键词
单独使用FilterWords：使用排除关键词进行搜索
FilterWords+FilterStart（true）：使用域名开头排除关键词进行搜索
FilterWords+FilterEnd（true）：使用域名结尾排除关键词进行搜索
FilterWords+FilterStart（true）+FilterEnd（true）：使用域名开头或结尾排除关键词进行搜索
     */
    public String getFilterWords() {
        return this.FilterWords;
    }

    /**
     * Set 域名排除关键词
单独使用FilterWords：使用排除关键词进行搜索
FilterWords+FilterStart（true）：使用域名开头排除关键词进行搜索
FilterWords+FilterEnd（true）：使用域名结尾排除关键词进行搜索
FilterWords+FilterStart（true）+FilterEnd（true）：使用域名开头或结尾排除关键词进行搜索
     * @param FilterWords 域名排除关键词
单独使用FilterWords：使用排除关键词进行搜索
FilterWords+FilterStart（true）：使用域名开头排除关键词进行搜索
FilterWords+FilterEnd（true）：使用域名结尾排除关键词进行搜索
FilterWords+FilterStart（true）+FilterEnd（true）：使用域名开头或结尾排除关键词进行搜索
     */
    public void setFilterWords(String FilterWords) {
        this.FilterWords = FilterWords;
    }

    /**
     * Get 交易类型（目前只支持10）
10: 预释放域名 
     * @return TransType 交易类型（目前只支持10）
10: 预释放域名
     */
    public Long getTransType() {
        return this.TransType;
    }

    /**
     * Set 交易类型（目前只支持10）
10: 预释放域名
     * @param TransType 交易类型（目前只支持10）
10: 预释放域名
     */
    public void setTransType(Long TransType) {
        this.TransType = TransType;
    }

    /**
     * Get 是否搜索白金域名（默认值为false） 
     * @return IsTop 是否搜索白金域名（默认值为false）
     */
    public Boolean getIsTop() {
        return this.IsTop;
    }

    /**
     * Set 是否搜索白金域名（默认值为false）
     * @param IsTop 是否搜索白金域名（默认值为false）
     */
    public void setIsTop(Boolean IsTop) {
        this.IsTop = IsTop;
    }

    /**
     * Get 结束时间排序 desc:倒序 asc:正序 
     * @return EndTimeSort 结束时间排序 desc:倒序 asc:正序
     */
    public String getEndTimeSort() {
        return this.EndTimeSort;
    }

    /**
     * Set 结束时间排序 desc:倒序 asc:正序
     * @param EndTimeSort 结束时间排序 desc:倒序 asc:正序
     */
    public void setEndTimeSort(String EndTimeSort) {
        this.EndTimeSort = EndTimeSort;
    }

    /**
     * Get 结束时间（YYYY-MM-DD） 
     * @return EndTime 结束时间（YYYY-MM-DD）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（YYYY-MM-DD）
     * @param EndTime 结束时间（YYYY-MM-DD）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribePreReleaseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreReleaseListRequest(DescribePreReleaseListRequest source) {
        if (source.Keywords != null) {
            this.Keywords = new String(source.Keywords);
        }
        if (source.DomainStart != null) {
            this.DomainStart = new Boolean(source.DomainStart);
        }
        if (source.DomainEnd != null) {
            this.DomainEnd = new Boolean(source.DomainEnd);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.PriceStart != null) {
            this.PriceStart = new Float(source.PriceStart);
        }
        if (source.PriceEnd != null) {
            this.PriceEnd = new Float(source.PriceEnd);
        }
        if (source.LengthStart != null) {
            this.LengthStart = new Long(source.LengthStart);
        }
        if (source.LengthEnd != null) {
            this.LengthEnd = new Long(source.LengthEnd);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Suffix != null) {
            this.Suffix = new Long[source.Suffix.length];
            for (int i = 0; i < source.Suffix.length; i++) {
                this.Suffix[i] = new Long(source.Suffix[i]);
            }
        }
        if (source.ClassOne != null) {
            this.ClassOne = new Long(source.ClassOne);
        }
        if (source.ClassTwo != null) {
            this.ClassTwo = new Long[source.ClassTwo.length];
            for (int i = 0; i < source.ClassTwo.length; i++) {
                this.ClassTwo[i] = new Long(source.ClassTwo[i]);
            }
        }
        if (source.ClassThree != null) {
            this.ClassThree = new Long[source.ClassThree.length];
            for (int i = 0; i < source.ClassThree.length; i++) {
                this.ClassThree[i] = new Long(source.ClassThree[i]);
            }
        }
        if (source.ClassFour != null) {
            this.ClassFour = new Long[source.ClassFour.length];
            for (int i = 0; i < source.ClassFour.length; i++) {
                this.ClassFour[i] = new Long(source.ClassFour[i]);
            }
        }
        if (source.FilterStart != null) {
            this.FilterStart = new Boolean(source.FilterStart);
        }
        if (source.FilterEnd != null) {
            this.FilterEnd = new Boolean(source.FilterEnd);
        }
        if (source.FilterWords != null) {
            this.FilterWords = new String(source.FilterWords);
        }
        if (source.TransType != null) {
            this.TransType = new Long(source.TransType);
        }
        if (source.IsTop != null) {
            this.IsTop = new Boolean(source.IsTop);
        }
        if (source.EndTimeSort != null) {
            this.EndTimeSort = new String(source.EndTimeSort);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keywords", this.Keywords);
        this.setParamSimple(map, prefix + "DomainStart", this.DomainStart);
        this.setParamSimple(map, prefix + "DomainEnd", this.DomainEnd);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "PriceStart", this.PriceStart);
        this.setParamSimple(map, prefix + "PriceEnd", this.PriceEnd);
        this.setParamSimple(map, prefix + "LengthStart", this.LengthStart);
        this.setParamSimple(map, prefix + "LengthEnd", this.LengthEnd);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "Suffix.", this.Suffix);
        this.setParamSimple(map, prefix + "ClassOne", this.ClassOne);
        this.setParamArraySimple(map, prefix + "ClassTwo.", this.ClassTwo);
        this.setParamArraySimple(map, prefix + "ClassThree.", this.ClassThree);
        this.setParamArraySimple(map, prefix + "ClassFour.", this.ClassFour);
        this.setParamSimple(map, prefix + "FilterStart", this.FilterStart);
        this.setParamSimple(map, prefix + "FilterEnd", this.FilterEnd);
        this.setParamSimple(map, prefix + "FilterWords", this.FilterWords);
        this.setParamSimple(map, prefix + "TransType", this.TransType);
        this.setParamSimple(map, prefix + "IsTop", this.IsTop);
        this.setParamSimple(map, prefix + "EndTimeSort", this.EndTimeSort);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

