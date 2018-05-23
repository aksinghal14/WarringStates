# Assignment Two Feedback

## Group members: u6233314,u6252997,u6322388

## Tutor Comment
Good work! Passed most tests and implemented a basic playable game. Good try on starting music. Clicking on text could not make a move, which is potentially to be fixed. Despite the timeout issue and changing text color, the game could still be better by implementing a viewer of players and flags. And unused code better to be removed. Duplicate code in Game.java can actually be eliminated a lot by creating methods. Nice job overall :)

## Mark

**7.3/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | .25/.25 |
||Authorship clear for all classes      | .25/.25 |
||Appropriate use of git                | .5/.5  |
||Program runs from jar                 | /.25 |
|P|Appropriate use of OO features       | /.5  |
|P|Presentation pdf complete            | .5/.5  |
|CR|Program well designed               | .3/.5  |
|CR|Comments clear and sufficient       | .5/.5  |
|CR|Coding style good                   | .2/.25 |
|CR|Appropriate use of JUnit tests      | .5/.5  |
|D|Design and code of very high quality | /.25 |
|D|Demonstrates interesting extensions  | /.25 |
|D|Works well and easy to run           | .25/.25 |
|HD|Game is exceptional                 | /.5  |

**Total for miscellaneous marks:**  3.25/5.25

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Game can be played by 2-4 humans | /.25 |
|CR|Only valid moves allowed         | .25/.25 |
|CR|Flags and supporters displayed   | /.25 |
|CR|End of game indicates winner     | /.25 |
|D |Basic computer opponent          | /.25 |
|HD|Advanced computer opponent       | /.5  |

**Total for manual marks:** 0.25/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|CardPlacementWellFormed|5/5|.5|
|3|PlacementWellFormed|5/5|.5|
|5|MoveLegal|5/5|.5|
|6|MoveSequenceValid|5/5|1|
|7|GetSupporters|3/3|.375|
|8|GetFlags|2/3|.250|
|10|GenerateMove|3/3|.5|

**Total for tests:** 3.87/4.0

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work.


Signed: Shunyu Yao(u6252997),RUIYI SUN (u6233314), and Akshat Singhal (u6322388)
#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of doing task 7 & 8 came from Ruiyi Sun

* The idea of doing task 10 came from Shunyu Yao

* The idea of doing task 9 came from Akshat Singhal

Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)

#### Originality statements E
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:
* The idea of Testing code came from the lecture and the Test code(i.e. GetSupportersTest)
* The code in class <updatePlacementTest><getCardTest><SortCardTest> uses an idea suggested by <TestUtility>
*https://www.geeksforgeeks.org/find-max-min-value-array-primitives-using-java/ is the code use for task8
Signed: RUIYI SUN (u6233314)

I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:


Signed: Shunyu Yao (u6252997)

I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work:

* I got idea of writing tests from the lecture slides and understanding them.
* I did the tasks for Task 2 and task 3 which shows the card placement well formed and  placement well formed

Signed: Akshat Singhal (u6322388)
#### Originality statements D
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Ruiyi Sun (u6233314)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Shunyu Yao (u6252997)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of putting controls and basic board layout came from lecture slides and Task 4


Signed: Akshat Singhal (u6322388)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of doing task3 came from Shunyu Yao
* The idea of doing task4 came from Akshat Singhal
* The idea of doing task5 came from Ruiyi Sun


Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of doing task2 came from Shunyu Yao using if else from the homework question (noted in source code comments)


Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)

## Git Log
```
commit 0482464bf496f953c09da4a71db6b0b512db6481
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Fri May 18 09:45:03 2018 +1000

    write some comments

commit 1daa9471f7d6e7bd9943c77978ed73c178c1d8ab
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Fri May 18 09:42:18 2018 +1000

    statements

commit 7f5b86a2c7409412a16b7742b543ff7b85847e90
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Fri May 18 09:29:49 2018 +1000

    pdf presentation

commit 0036fa1533df360fc4b2361e66e6328a7d6eb2f0
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Fri May 18 09:20:35 2018 +1000

    finish contribution

commit 4eb57e7f6e9c72bef4bd2c5ed29cfe19292b0185
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Fri May 18 09:06:09 2018 +1000

    statements

commit ad5fddf01f9489a2ccebde7d14624c922d70de36
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Fri May 18 08:46:32 2018 +1000

    game.jar

commit 8a46fc805b9826cc3ba626e34bbf1a1b476c9c96
Merge: ddd2e6c c089c29
Author: u6252997 <u6252997@anu.edu.au>
Date:   Thu May 17 23:29:22 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit ddd2e6cde0fd569623cb39e172ce2ca2fab44456
Author: u6252997 <u6252997@anu.edu.au>
Date:   Thu May 17 23:28:57 2018 +1000

    finish half of Game

commit c089c29073848cb6d713f30ee7cdacea665f7469
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Thu May 17 23:26:49 2018 +1000

    ppt

commit caef5d545e7be36d1e0ab05eb5edcee9401ef73a
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Thu May 17 22:40:03 2018 +1000

    refresh

commit dac28a40b53b54f2eaef2f6c21776dc751612ecd
Merge: 6635767 7b795ff
Author: u6252997 <u6252997@anu.edu.au>
Date:   Thu May 17 22:38:28 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 6635767d2d6d2463b4cc076c67fbd385bf499852
Author: u6252997 <u6252997@anu.edu.au>
Date:   Thu May 17 22:38:00 2018 +1000

    finish half of Game

commit 7b795ffe9809313db4c506bfe96e3916c78d0020
Merge: dcd6773 5ea5c24
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 22:18:32 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit dcd6773210cecac9c963be3df31b095fe6e6b582
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 22:18:13 2018 +1000

     time #8

commit 5ea5c2497d655a244ec50a11c734cb8865f34057
Merge: 0aad283 bf1836b
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Thu May 17 22:17:25 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 0aad283729b09d57763dac24045f47b374ec24b8
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Thu May 17 22:16:57 2018 +1000

    flag

commit bf1836bf2b24bf4e52156765ec199c1bea882686
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 22:13:46 2018 +1000

     time #8

commit 0b0f97c3d2b3313b71cd84281cdd0ee6b459b69e
Merge: ab98b0a 70a6fd1
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 22:12:48 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit ab98b0a3cb6f41496f3c8fbdaea9e57563e709de
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 22:11:50 2018 +1000

     time #8

commit 5ce519228037f9b9e470fa0c3d054c0c75447387
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 21:43:02 2018 +1000

    sometimes running out of time #8

commit 70a6fd12200317ef18b388da95ade234ee2de132
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Thu May 17 21:39:15 2018 +1000

    task9

commit ae9312d951a3977a9458f17d127df4d6fca8bbe5
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 17 21:12:57 2018 +1000

    delete useless code

commit 0ca460b5223751bb5691141ffc2787037b204170
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 17 20:07:55 2018 +1000

    try to fix task8

commit f09dabc7f5283f9f7d256916ff95d7f778bac3e3
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 19:43:14 2018 +1000

    sometimes running out of time #8

commit 976d5ad1f14a4c5b5b0aed9359560f3d10a69295
Author: u6233314 <u6233314@anu.edu.au>
Date:   Thu May 17 19:20:27 2018 +1000

    pass sometimes

commit 8b4e0366891635bd515421480260340e2bb7319d
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 17 19:07:37 2018 +1000

    try!!

commit 5b3579a6f87df44427461848a1f9b52090262c46
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 17 19:02:20 2018 +1000

    finish contribution

commit 9ea4e958ae7d5493b5d0cc0ddf2b67161d11aedb
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 17 16:24:33 2018 +1000

    try to fix task 8

commit 9efc0a3944bc529f2baf4d9880bb057a2fc24987
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 16:43:11 2018 +1000

    game.jar

commit ffcf281c64fbf5d30cc7f0d8924fa9e0fd5185a9
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 16:42:47 2018 +1000

    Music File

commit e74c96e1c60376891e9ab8b0e87ff2aec81a024d
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed May 16 16:40:26 2018 +1000

    task9

commit eceece78dea9263cda373ca568a9ae0ff1584cb9
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed May 16 16:39:06 2018 +1000

    task9

commit 2ecfb4fbd96cd533507f820b3fea939aa98085bc
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 15:09:03 2018 +1000

    Music File

commit 5924e25fae431e803c67ed3c2f00ef3949b1f8cb
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 15:07:53 2018 +1000

    Music File

commit 736e3ec9c9736f652ccefe8acafcb8c2e41162ba
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 14:46:32 2018 +1000

    Music File

commit aa235fe2f58240f8e90c196d94a38976b7cd32d8
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 14:42:19 2018 +1000

    Music File

commit 18f4593ad52adc558831fc9d9c5a85116db822da
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 16 14:37:24 2018 +1000

    Music File

commit c9b051cd9b28798584f35a138e7267d6eedaa7e7
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 16 14:27:56 2018 +1000

    fix the task8 timeout problem

commit 24a47f950be7a3f02c6a34364d1d4a84fd8248a2
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 16 13:19:32 2018 +1000

    finish contribution

commit da19bad2bdaf950c269b08a03b784899702f102b
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 9 16:36:08 2018 +1000

    push

commit 25744e6826cd6973709af755f70ac80162137497
Merge: d0d6188 6b96332
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed May 9 16:23:55 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit 6b9633233b358e140888763abc09f4f3c30aae1d
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 9 16:17:12 2018 +1000

    game.jar

commit d0d618888c0312b8a96609641d036dcbda8406aa
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed May 9 16:08:05 2018 +1000

    D2F

commit 321c4ea8443a514b32cf50d55cf2b992e38c608c
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 9 16:06:23 2018 +1000

    game.jar

commit 2128d08cd0b870789702f30d258d93f8cc95f23a
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 9 15:50:13 2018 +1000

    finish review

commit 035c94a7de23eb7144f616414bf2cb185ac2bccc
Merge: d03b6a1 5afcd3e
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 9 15:48:30 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/gui/Viewer.java

commit d03b6a12bd7a171ab593e0888ae6107d7ecc33c8
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 9 15:45:36 2018 +1000

    finish review

commit bda8d026d8a869059ad2c890c65e7c1559eddb0e
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 9 15:44:12 2018 +1000

    finish review

commit a452601d9824eff099af354170b0b0daedcfa3d9
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 9 15:22:02 2018 +1000

    The longer names seems to be out of box but I tried to put the shorter ones inside the box

commit 5afcd3e0de14c02eca8c29562afe5b7e041ef842
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 9 15:13:56 2018 +1000

    review, authorships

commit f3719104430fbbf249e541775ace3610379b1074
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Tue May 8 19:50:23 2018 +1000

    The longer names seems to be out of box but I tried to put the shorter ones inside the box

commit 4e2f2e1a14b73ca3759570e023e11987e99a5a01
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Tue May 8 19:48:20 2018 +1000

    Originality and contribution

commit 495bd601148d6c44bb11022d19ccccd681232b20
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Tue May 8 15:33:42 2018 +1000

    finish task#10

commit 9ae06e34cb5a7dc6f572f70844ad164c2bf7ea7c
Author: u6233314 <u6233314@anu.edu.au>
Date:   Mon May 7 15:09:11 2018 +1000

    feel struggle about test 8 *** should be careful about time limit

commit 99a2c4a8672e64f73e1d38364f6feafefc7e70ca
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 3 22:26:15 2018 +1000

    fix task8 but test running out of time

commit 75532f98f31164fa9a77d8f1bcc158618cee1e24
Merge: 1bb73df e2dfa4e
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu May 3 18:26:07 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 1bb73dfef1cd77bbddd1736d49724f460d0d506b
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 2 15:27:14 2018 +1000

    delete some useless one

commit dd7f1b9aa5165471e4c1b18b66ca30c53e1682c5
Merge: a46eef6 cc3903a
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 2 15:20:48 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit a46eef61b51009b40d435ac62653f4d2712fd3a6
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 2 15:20:18 2018 +1000

    add test 6

commit cc3903aef57ee81cfdf6b5c0ee802187104a8ed2
Merge: 097664a 44d3bcc
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 2 13:57:03 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit 097664afe107f9f0120d8e2dc89adf0f4193db63
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 2 13:56:16 2018 +1000

    Edited originality statement

commit 44d3bcc4b040c43d96fda1234b9e15e9df147252
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 2 13:50:22 2018 +1000

    add test 6

commit e740f53c3e62b1d792e1cb6312cae82bd49b6e3b
Merge: b865985 540e61b
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 2 13:48:22 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit b865985acd186b10a77239c15f9a5d1f950ad7e2
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Wed May 2 13:47:49 2018 +1000

    add test 6

commit 540e61be5444cfa77b42d40bb6fc82144a881999
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 2 13:46:41 2018 +1000

    TestPlacement for Task3

commit 4af94a11221c6202aed4e412979fcae171921a4f
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed May 2 13:43:00 2018 +1000

    TestDummy for Task 2

commit b68a01177dc17162d4996eabfecba1557b026703
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sat Apr 28 22:10:07 2018 +1000

    add some test for Task7 and finish task 7 but it run a little bit long

commit b32aa88494296801ece2272358f091f3904259a2
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Fri Apr 27 21:16:58 2018 +1000

    create E originality

commit e2dfa4e5fc035da3d27f1cd8b3cb202a907266b9
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Apr 26 21:00:12 2018 +1000

    GetSupportersTest should not require supporters to be sorted

commit 484b89db8f5eadfdc2459aa89e53762cfdd7cbf6
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Apr 26 16:25:26 2018 +1000

    simplify GetFlagsTest and improve error output

commit df968b797dd931c62410bd6ae12085bd3765c91f
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Tue Apr 24 15:18:50 2018 +1000

    a little problem

commit e8739d5e11a0f5bb14012f4681644d34ac6331e4
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Tue Apr 24 15:08:24 2018 +1000

    add the correct text for name

commit 67ac02bd58bcf842fba26c1c43043c61bda5e649
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Tue Apr 24 15:00:50 2018 +1000

    fix the bug

commit f0a6eef57743e49175f6dfe8e4543409c7fbe49e
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Tue Apr 24 02:05:52 2018 +1000

    finish task 4!!!!!!> __ <

commit 3fb81a0a0da7a27207d17a404a55eab2c929cb48
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Tue Apr 24 00:14:43 2018 +1000

    fix some problems in task 4

commit 80d54aaaf7222a3a411d5e3fb67c03f7bf9e43bf
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Mon Apr 23 21:32:03 2018 +1000

    Corrections to be done in task4

commit 4fabfa9434d8aa000f0d88f0ad3af8f21900f57a
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Mon Apr 23 16:50:20 2018 +1000

    fix some problems about git push files

commit bc7d1bf798553c0fabaffd8dc2ca001dbc75f576
Merge: 7ea1887 eba1b97
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Apr 18 15:02:42 2018 +1000

    Merge remote-tracking branch 'origin/master'

commit 7ea188799bc9e324ad918dc36b51026963fd6602
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Apr 18 15:02:32 2018 +1000

    #6

commit eba1b97e2f6ad85fb1239e21bc97896a6758cbff
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed Apr 18 07:28:51 2018 +1000

    Originality Statements

commit eb794a2c90f061d6192e123ec6288cd9d219fe16
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed Apr 18 07:23:58 2018 +1000

    Putting the controls in T9

commit 99727e7c2e516a0d7dc4541605ebee3514fd092f
Merge: 1a8a36d 36c3e70
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed Apr 11 08:58:48 2018 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 36c3e706fb68df0e7de005e13e91be541cd8b3af
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Apr 10 22:48:08 2018 +1000

    added tests: Task 8 GetFlagsTest and Task 10 GenerateMoveTest
    
    also renamed CardPlacementWellFormedTest to be consistent with others

commit 73752b7951cd7b3ba40dd9800e2b9acfadfe357f
Merge: 736a63a 1a8a36d
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Tue Apr 10 15:53:18 2018 +1000

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/comp1110/ass2/WarringStatesGame.java

commit 736a63ac0f46b7aaefb2ee49df311d410a526b50
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Tue Apr 10 15:53:03 2018 +1000

    #6

commit 1a8a36d33166b5f16823ba5f40c55ec6a9869721
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu Mar 29 21:27:56 2018 +1100

    finish task6

commit 742c3b377f2adf7354343118d5886049907b1299
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu Mar 29 21:24:35 2018 +1100

    finish it

commit a22997a9f7610756bee6971a314b20461c19a650
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu Mar 29 21:06:41 2018 +1100

    pass some of it

commit 75cb229600ef4857e84e0a005d4d2c858bdcbeed
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Thu Mar 29 20:24:38 2018 +1100

    try task 6 should be some problem in it

commit 757834dee3b6e2152aced69b582118135d79e5b0
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Sun Mar 25 23:01:40 2018 +1100

    Viewer half

commit bc9cbef9ce7f4dfa6c99d0c2784fb621c97b1b20
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Sun Mar 25 20:10:13 2018 +1100

    Viewer half

commit f5eadb32a3863d447436d9f461648299f40a701d
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Sun Mar 25 15:09:41 2018 +1100

    Viewer half

commit 9f654a20f507da5231b34b09871acaf24d3a0dc3
Merge: b8bf512 4f20548
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Sun Mar 25 14:27:56 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit b8bf512b2e2a7f4240a7c4de57b092ab17e21cae
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Sun Mar 25 14:27:47 2018 +1100

    #6

commit 4f20548a7ec6a06e57ee9f9a37ca400d7fbc9fee
Merge: 1384af4 56af23d
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sun Mar 25 13:16:08 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit 1384af4e424682573d7819293e3f948afc0c3635
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sun Mar 25 13:16:02 2018 +1100

    finish task 5 cheer！！！！！

commit 56af23d630c67dfd4270d1f66049402842c4fef5
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Sun Mar 25 09:37:15 2018 +1100

    Originality, Contribution and comments

commit 076f264862fed851187f63e14c20f173d672a353
Merge: c7e8eef 6d8f01f
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Sun Mar 25 09:02:11 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit c7e8eef95a41b2fb78ac2ea54fb32a5a550ce715
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Sun Mar 25 09:01:56 2018 +1100

    finish task3

commit 6d8f01f233adef30519499bc57f64508e16e7a54
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sun Mar 25 00:08:44 2018 +1100

    finish task 5 cheer！！！！！

commit 58921edc66b898ba822534bf9468613bb38d4605
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sat Mar 24 20:10:17 2018 +1100

    only one problem in task5

commit a3211c67d3f165e1b76b485ace5e14c38d639e2e
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sat Mar 24 17:52:23 2018 +1100

    something should improve #5

commit 08bff709e3268f0d3748db66d931c8030251919c
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sat Mar 24 14:41:56 2018 +1100

    only one problem

commit 73cfc14e9fcc204bfbc43437df4264920593c27b
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sat Mar 24 11:43:51 2018 +1100

    pass some of the test of task 5

commit 89477eb62f6fd083e055a776c79168e3a50b8332
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Sat Mar 24 11:20:16 2018 +1100

    try to do #5

commit 62ec68a46e220af3a99d5a2e01a96f5a3a7be4e8
Merge: 0453019 36779f5
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed Mar 21 16:53:55 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit 36779f55afd6e4d841520de208ac0094b7012b25
Merge: 84f74fd 3e8f803
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Mar 21 16:52:46 2018 +1100

    Merge remote-tracking branch 'origin/master'
    
    # Conflicts:
    #       src/gittest/Main.java

commit 0453019d1db981599caca8ad037896f433a03814
Author: Cindy <u6322388@anu.edu.au>
Date:   Wed Mar 21 16:52:04 2018 +1100

    Main change

commit 3e8f803d9fc35e883b84121bf2e51e704be5e8a7
Author: Alice <u6233314@anu.edu.au>
Date:   Wed Mar 21 16:51:56 2018 +1100

    change main add A

commit 84f74fd1e6ea9b8ee5ed145f4759ea06e2c32ce4
Author: Bob <u6252997@anu.edu.au>
Date:   Wed Mar 21 16:51:52 2018 +1100

    b

commit fb87229ecbb9b97b865338c9d6174cb9aa4b3c0f
Merge: 5ab1210 ed2c6bb
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Mar 21 16:28:52 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit ed2c6bb7e9bfc1a3e4a8aab024410055c6b96934
Author: Cindy <u6322388@anu.edu.au>
Date:   Wed Mar 21 16:28:16 2018 +1100

    Added class C

commit 5ab1210de74688d2e7d431ecb0b801e1fc5c64be
Author: Bob <u6252997@anu.edu.au>
Date:   Wed Mar 21 16:26:32 2018 +1100

    add class B

commit 156834ad91866387eb29d98f95a521f6f3736730
Merge: f13a482 5acac4c
Author: u6233314 <u6233314@anu.edu.au>
Date:   Wed Mar 21 16:24:10 2018 +1100

    Merge remote-tracking branch 'origin/master'

commit f13a4829136a6cceeb7cf72a6d909191ef8c7d39
Author: Alice <u6233314@anu.edu.au>
Date:   Wed Mar 21 16:23:44 2018 +1100

    add main class and a

commit 5acac4ca6603cb5e93477adf33e05461d79f8bef
Merge: 7dcdd9c e7448a2
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed Mar 21 16:14:55 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit 7dcdd9cee2d5e04cc0037a7bad42099c71638435
Merge: b4d9333 ca2d2f4
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Wed Mar 21 16:14:16 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit e7448a2ca5c7c783acbc72c3414f7692791bcc25
Merge: b4d9333 ca2d2f4
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Mar 21 15:54:51 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit b4d933388e84bc398a292c8c10ab57597a46b026
Merge: e24e295 9141953
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Mar 21 15:49:45 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6233314/comp1110-ass2-wed16g

commit e24e295308f1084c13130baddff54da519c13047
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Wed Mar 21 15:46:44 2018 +1100

    finish half of task3

commit 91419537e8438f6a4c9ee441c98bb9a3ad872053
Author: sun ruiyi <u6233314@anu.edu.au>
Date:   Tue Mar 20 16:45:42 2018 +1100

    #6#7#8 comment (try)

commit ca2d2f4d325faef911ef2bdfd6ca1e1c028e4697
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Mon Mar 19 18:58:31 2018 +1100

    fix to error message for CardPlacementWellFormed.testCase for valid string
    
    thanks to Jay Heyman for finding

commit 0e6f877f274c23203e22a080afabba48732c1973
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Mon Mar 19 15:00:27 2018 +1100

    comment task5

commit 052053839a7fa1c34fd00627f121e4a7cf14e330
Author: Akshat Singhal <u6322388@anu.edu.au>
Date:   Mon Mar 19 14:54:57 2018 +1100

    Originality, Contribution and comments

commit 845727282f512fc21a04a9d31e86987d05887ddc
Author: shunyuyao <u6252997@anu.edu.au>
Date:   Mon Mar 19 14:23:25 2018 +1100

    finish task2

commit 10a0d461c8d7f95f4cefc75d8feff0f4ee43115a
Merge: 9700ecf efff375
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 18 21:15:32 2018 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 9700ecfaa66ba883caaaf32fc72a3af405931f13
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Sun Mar 18 21:13:59 2018 +1100

    fix to Task 5 testNoCard - included incorrect 'stay put' move for Zhang Yi
    
    thanks to Cooper Yang for finding this bug

commit efff3750e8fb92cf4f822b270d1d1915a71c2d29
Author: COMP1110 2018 S1 <josh.milthorpe+comp1110-2018s1@anu.edu.au>
Date:   Thu Mar 15 17:14:22 2018 +1100

    remove link to non-existent statement of originality

commit 55545e7867b9903ddbe9247c9a143ccc53655f63
Author: milthorpe <josh.milthorpe@gmail.com>
Date:   Wed Mar 14 23:46:03 2018 +1100

    fix typo in locations image

commit b59a979d9604995508e01a7879daa031be2be6c7
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 13 17:25:19 2018 +1100

    fix CardPlacementWellFormed: was calling wrong method isPlacementWellFormed

commit adcde368e6588adec46a48f85782ab70c9644add
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 13 13:01:51 2018 +1100

    print out valid placement string in CardPlacementWellFormed.checkSimpleValid

commit a5266a419c512e3c432b240fee12f9fe69a1f246
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Tue Mar 13 12:43:58 2018 +1100

    isCardPlacementWellFormed specification should mention Zhang Yi (z9) is allowed

commit e2f00bd5b201e6065f70aa85d7b00a378129aae9
Author: milthorpe <josh.milthorpe@gmail.com>
Date:   Tue Mar 13 07:31:52 2018 +1100

    COMP1110 Assignment 2 2018 S1

commit cee45f5d06e0cd03de74b15abe6488a44bf89ee8
Author: milthorpe <josh.milthorpe@gmail.com>
Date:   Thu Mar 1 08:06:29 2018 +1100

    Initial commit
```
## Changes
```
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2018-05-18 08:54:16.257374551 +1000
+++ comp1110-ass2/admin/B-contribution.md	2018-05-18 09:58:05.129378830 +1000
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6252997 33
+* u6322388 33
+* u6233314 33
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2018-05-18 08:54:16.273374638 +1000
+++ comp1110-ass2/admin/B-originality.md	2018-05-18 09:58:05.137378871 +1000
@@ -1,9 +1,6 @@
 We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of doing task2 came from Shunyu Yao using if else from the homework question (noted in source code comments)
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
 
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2018-05-18 08:54:16.285374702 +1000
+++ comp1110-ass2/admin/C-contribution.md	2018-05-18 09:58:05.145378915 +1000
@@ -1,7 +1,8 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6252997 33
+* u6322388 33
+* u6233314 33
+
+Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2018-05-18 08:54:16.293374746 +1000
+++ comp1110-ass2/admin/C-originality.md	2018-05-18 09:58:05.153378957 +1000
@@ -1,9 +1,8 @@
 We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of doing task3 came from Shunyu Yao
+* The idea of doing task4 came from Akshat Singhal
+* The idea of doing task5 came from Ruiyi Sun
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
 
-*  ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.md
Only in comp1110-ass2/admin: D-originality-u6233314.md
Only in comp1110-ass2/admin: D-originality-u6252997.md
Only in comp1110-ass2/admin: D-originality-u6322388.md
Only in ../master/comp1110-ass2/admin: E-originality-u1234567.md
Only in comp1110-ass2/admin: E-originality-u6233314.md
Only in comp1110-ass2/admin: E-originality-u6252997.md
Only in comp1110-ass2/admin: E-originality-u6322388.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2018-05-18 08:54:16.337374984 +1000
+++ comp1110-ass2/admin/F-contribution.md	2018-05-18 09:58:05.249379468 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* u6252997 33
+* u6322388 33
+* u6233314 33
 
+Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2018-05-18 08:54:16.357375092 +1000
+++ comp1110-ass2/admin/F-originality.md	2018-05-18 09:58:05.257379511 +1000
@@ -1,9 +1,9 @@
 We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of doing task 7 & 8 came from Ruiyi Sun
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The idea of doing task 10 came from Shunyu Yao
 
-* ....
+* The idea of doing task 9 came from Akshat Singhal
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Shunyu Yao (u6252997), Akshat Singhal (u6322388), and Ruiyi Sun (u6233314)
Only in comp1110-ass2/admin: F-review-u6233314.md
Only in comp1110-ass2/admin: F-review-u6252997.md
Only in comp1110-ass2/admin: F-review-u6322388.md
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u6233314.md
Only in comp1110-ass2/admin: G-best-u6252997.md
Only in comp1110-ass2/admin: G-best-u6322388.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2018-05-18 08:54:16.389375265 +1000
+++ comp1110-ass2/admin/G-contribution.md	2018-05-18 09:58:05.533380977 +1000
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u6252997 33
+* u6233314 33
+* u6322388 33
 
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Shunyu Yao(u6252997),RUIYI SUN (u6233314), and Akshat Singhal (u6322388)
 
diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2018-05-18 08:54:16.397375309 +1000
+++ comp1110-ass2/admin/G-features.md	2018-05-18 09:58:05.545381041 +1000
@@ -1,16 +1,14 @@
 In addition to the features that are auto-graded, the graphical user interface
 of our project implements the following features:
 
-*(Remove those that are unimplemented)*
-
- - A simple placement viewer (Task 4)
+ - A simple placement viewer (Task 4) with own designed kingdoms
  - A basic playable Warring States game (Tasks 2-3, 5-7)
  - A basic playable link Warring States game that allows legal moves and collects supporters (Task 8)
- - Compute scoring (Task 9)
+ - Compute scoring (Task 9) - partial as it checks the cards captured and display them in the output but doesn't show them on the screen
  - Generate a valid move (Task 10)
- - Basic computer opponent (Task 11)
- - Advanced computer opponent (Task 12)
 
 additional features...
 
+- A song file which plays at the starting of the game
+
 
diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2018-05-18 08:54:16.409375374 +1000
+++ comp1110-ass2/admin/G-originality.md	2018-05-18 09:58:05.553381085 +1000
@@ -1,9 +1,4 @@
-We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
+We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work.
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Shunyu Yao(u6252997),RUIYI SUN (u6233314), and Akshat Singhal (u6322388)
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/admin/H-contribution.md comp1110-ass2/admin/H-contribution.md
--- ../master/comp1110-ass2/admin/H-contribution.md	2018-05-18 08:54:16.425375460 +1000
+++ comp1110-ass2/admin/H-contribution.md	2018-05-18 09:58:05.561381127 +1000
@@ -1,8 +1,7 @@
 We declare that the work toward our submission of Stage H was distributed among the group members as follows:
 
-* u2345678 30
-* u3456789 40
-* u0123456 30
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* u6252997 33
+* u6233314 33
+* u6322388 33
 
+Signed: Shunyu Yao(u6252997),RUIYI SUN (u6233314), and Akshat Singhal (u6322388)
diff -ru -x .git ../master/comp1110-ass2/admin/H-originality.md comp1110-ass2/admin/H-originality.md
--- ../master/comp1110-ass2/admin/H-originality.md	2018-05-18 08:54:16.445375569 +1000
+++ comp1110-ass2/admin/H-originality.md	2018-05-18 09:58:05.569381169 +1000
@@ -1,10 +1,6 @@
 We declare that the work we have submitted for Stage H of this assignment and all stages before it is entirely our own work, with the following documented exceptions:
 
-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* We took the idea of ppt template from ANU website
 
-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
-
-* ....
-
-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Shunyu Yao(u6252997),RUIYI SUN (u6233314), and Akshat Singhal (u6322388)
 
Only in comp1110-ass2/assets: Tone.mp3
diff -ru -x .git ../master/comp1110-ass2/comp1110-ass2.iml comp1110-ass2/comp1110-ass2.iml
--- ../master/comp1110-ass2/comp1110-ass2.iml	2018-05-18 08:54:16.549376131 +1000
+++ comp1110-ass2/comp1110-ass2.iml	2018-05-18 09:58:05.933383105 +1000
@@ -6,7 +6,7 @@
       <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
       <sourceFolder url="file://$MODULE_DIR$/tests" isTestSource="true" />
     </content>
-    <orderEntry type="inheritedJdk" />
+    <orderEntry type="jdk" jdkName="1.8" jdkType="JavaSDK" />
     <orderEntry type="sourceFolder" forTests="false" />
     <orderEntry type="module-library" scope="TEST">
       <library name="JUnit4">
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2/.idea: artifacts
diff -ru -x .git ../master/comp1110-ass2/.idea/misc.xml comp1110-ass2/.idea/misc.xml
--- ../master/comp1110-ass2/.idea/misc.xml	2018-05-18 08:54:16.109373750 +1000
+++ comp1110-ass2/.idea/misc.xml	2018-05-18 09:58:04.961377936 +1000
@@ -1,6 +1,6 @@
 <?xml version="1.0" encoding="UTF-8"?>
 <project version="4">
-  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_8" default="false" project-jdk-name="1.8" project-jdk-type="JavaSDK">
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_8" default="false" project-jdk-name="9.0" project-jdk-type="JavaSDK">
     <output url="file://$PROJECT_DIR$/out" />
   </component>
 </project>
\ No newline at end of file
Only in comp1110-ass2: META-INF
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: Tone.mp3
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$10.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$11.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$12.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$13.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$14.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$15.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$16.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$17.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$18.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$19.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$20.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$21.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$22.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$23.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$24.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$25.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$26.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$27.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$28.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$29.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$30.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$31.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$32.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$33.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$34.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$35.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$36.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$37.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$38.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$3.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$4.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$5.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$6.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$7.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$8.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game$9.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Game.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Game.java comp1110-ass2/src/comp1110/ass2/gui/Game.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Game.java	2018-05-18 08:54:16.585376326 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Game.java	2018-05-18 09:58:06.209384573 +1000
@@ -1,11 +1,47 @@
 package comp1110.ass2.gui;
 
+import comp1110.ass2.WarringStatesGame;
+import gittest.C;
 import javafx.application.Application;
+import javafx.event.ActionEvent;
+import javafx.event.EventHandler;
+import javafx.scene.Group;
+import javafx.scene.Scene;
+import javafx.scene.control.*;
+import javafx.scene.image.Image;
+import javafx.scene.input.KeyCode;
+import javafx.scene.input.KeyEvent;
+import javafx.scene.input.MouseEvent;
+import javafx.scene.layout.AnchorPane;
+import javafx.scene.layout.BorderPane;
+import javafx.scene.layout.HBox;
+import javafx.scene.layout.StackPane;
+import javafx.scene.media.Media;
+import javafx.scene.media.MediaPlayer;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Rectangle;
+import javafx.scene.text.Font;
+import javafx.scene.text.Text;
 import javafx.stage.Stage;
+import javafx.scene.image.Image;
 
+import java.io.File;
+import java.util.ArrayList;
+import java.util.Collections;
+import java.util.List;
+import java.util.Scanner;
+
+/**
+ * A very simple viewer for card layouts in the Warring States game.
+ * <p>
+ * NOTE: This class is separate from your main game class.  This
+ * class does not play a game, it just illustrates various card placements.
+ */
+
+/** Idea- Shunyu Yao, Ruiyi Sun, Akshat Singhal
+ * Author- Shunyu Yao, Ruiyi Sun, Akshat Singhal
+ */
 public class Game extends Application {
-    private static final int BOARD_WIDTH = 933;
-    private static final int BOARD_HEIGHT = 700;
 
     // FIXME Task 9: Implement a basic playable Warring States game in JavaFX
 
@@ -13,9 +49,1473 @@
 
     // FIXME Task 12: Integrate a more advanced opponent into your game
 
+    private static final int VIEWER_WIDTH = 933;
+    private static final int VIEWER_HEIGHT = 700;
+
+    private static final String URI_BASE = "assets/";
+
+    private final Group root = new Group();
+    //private final Group players1 = new Group();
+    private final Group controls = new Group();
+    private final Group squareg = new Group();
+    private final Group pieces = new Group();
+    private boolean isGameOver;
+
+    private boolean triagger = false;
+
+    private double x;
+    private double y;
+
+    TextField textField;
+    TextField players1;
+    //Text players1 = new Text(900,1,"This is players1");
+
+    public String setup;
+
+    public String begin;
+
+    public String kingdom;
+
+    public String movesequence = "";
+    public String supporters1 = "";
+    public String supporters2 = "";
+
+    void makePlayer1(String supporters1){
+        Rectangle squarePlayer1 = new Rectangle(900,1,30,30);
+        //players1.getChildren().add(squarePlayer1);
+    }
+
+
+    void makePlacement(String placement) {
+
+        //this.pieces.getChildren().clear();// clearing pieces
+
+        while (root.getChildren().size() >= 36)// input string less than 36
+            root.getChildren().remove(root.getChildren().size() - 1);
+
+
+
+        placement = placement;
+        for (int i = 0; i < 6; i++) {
+            for (int j = 0; j < 6; j++) {
+                Rectangle square = new Rectangle(i * 100, j * 100, 90, 90);
+
+                Text text = new Text();
+                text.setLayoutX(i * 100 + 5);
+                text.setLayoutY(j * 100 + 50);
+
+
+                if (i == 0 && j == 0) {
+                    //4 is the location of card on the board
+                    if(getIndexPlacement('4',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('4',placement)-2, getIndexPlacement('4',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('4',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'4')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'4');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'4');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 1) {
+                    //5 is the location of card on the board
+                    if(getIndexPlacement('5',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('5',placement)-2, getIndexPlacement('5',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('5',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'5')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'5');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'5');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 2) {
+                    //6...
+                    if(getIndexPlacement('6',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('6',placement)-2, getIndexPlacement('6',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('6',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'6')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'6');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'6');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 3) {
+                    //7...
+                    if(getIndexPlacement('7',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('7',placement)-2, getIndexPlacement('7',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('7',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'7')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'7');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'7');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 4) {
+                    //8...
+                    if(getIndexPlacement('8',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('8',placement)-2, getIndexPlacement('8',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('8',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'8')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'8');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'8');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+
+                } else if (i == 0 && j == 5) {
+                    //9...
+                    if(getIndexPlacement('9',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('9',placement)-2, getIndexPlacement('9',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('9',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'9')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'9');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'9');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 1 && j == 1) {
+                    // Z...
+                    if(getIndexPlacement('Z',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Z',placement)-2, getIndexPlacement('Z',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Z',placement)-2)))));
+
+                        if(WarringStatesGame.isMoveLegal(setup,'Z')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+
+                                public void handle(MouseEvent me) {
+                                    //placement = WarringStatesGame.updatePlacement(placement,'2','4');
+                                    /*x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    System.out.println("click");*/
+
+                                    if(triagger){
+                                        //if(WarringStatesGame.isMoveLegal(setup,'1')){
+                                        //System.out.println(triagger);
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Z');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'Z');
+
+                                        //place = setup;
+                                        makePlacement(setup);
+                                        //System.out.println(setup);
+
+
+                                    }
+                                }
+                            });
+                        }
+
+
+                    }
+
+                } else if (i == 1 && j == 2) {
+                    // 0...
+                    if(getIndexPlacement('0',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('0',placement)-2, getIndexPlacement('0',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('0',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'0')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'0');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'0');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 1 && j == 3) {
+                    // 1...
+                    if(getIndexPlacement('1',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('1',placement)-2, getIndexPlacement('1',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('1',placement)-2)))));
+
+                        if(WarringStatesGame.isMoveLegal(placement,'1')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'1');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'1');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }
+
+
+                    }
+                } else if (i == 1 && j == 0) {
+                    // Y...
+                    if(getIndexPlacement('Y',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Y',placement)-2, getIndexPlacement('Y',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Y',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'Y')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    if(triagger){
+
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Y');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        //supporters = WarringStatesGame.getSupporters(setup,movesequence,1,0);
+                                        //System.out.println(supporters);
+
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'Y');
+
+
+                                        makePlacement(setup);
+
+                                    }
+                                }
+                            });
+                        }}
+
+                } else if (i == 1 && j == 4) {
+                    //2...
+                    if(getIndexPlacement('2',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('2',placement)-2, getIndexPlacement('2',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('2',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'2')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Z');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'2');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                    text.setFill(Color.WHITE);
+                } else if (i == 1 && j == 5) {
+                    //3
+                    if(getIndexPlacement('3',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('3',placement)-2, getIndexPlacement('3',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('3',placement)-2)))));
+
+
+                        if(WarringStatesGame.isMoveLegal(setup,'3')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+
+                                public void handle(MouseEvent me) {
+                                    //placement = WarringStatesGame.updatePlacement(placement,'2','4');
+                                   /* x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;*/
+                                    //System.out.println("click");
+                                    if(triagger){
+                                        //if(WarringStatesGame.isMoveLegal(setup,'1')){
+                                        //System.out.println(triagger);
+
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'3');
+                                        //System.out.println(index);
+                                        /*kingdom = setup.substring(index, index+2);
+                                        System.out.println(kingdom);
+                                        System.out.println(setup.substring(index+2,index+3));*/
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+
+
+
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'3');
+
+                                        //place = setup;
+                                        makePlacement(setup);
+                                        //System.out.println(setup);
+
+
+
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 2) {
+                    //U
+                    if(getIndexPlacement('U',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('U',placement)-2, getIndexPlacement('U',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('U',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'U')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'U');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'U');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 0) {
+                    //S...
+                    if(getIndexPlacement('S',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('S',placement)-2, getIndexPlacement('S',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('S',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'S')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'S');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'S');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 1) {
+                    //T...
+                    if(getIndexPlacement('T',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('T',placement)-2, getIndexPlacement('T',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('T',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'T')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'T');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'T');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 3) {
+                    //V...
+                    if(getIndexPlacement('V',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('V',placement)-2, getIndexPlacement('V',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('V',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'V')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'V');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'V');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 4) {
+                    //W...
+                    if(getIndexPlacement('W',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('W',placement)-2, getIndexPlacement('W',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('W',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'W')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'W');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'W');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 5) {
+                    //X...
+                    if(getIndexPlacement('X',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('X',placement)-2, getIndexPlacement('X',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('X',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'X')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'X');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'X');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+
+                } else if (i == 3 && j == 0) {
+                    // M...
+                    if(getIndexPlacement('M',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('M',placement)-2, getIndexPlacement('M',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('M',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'M')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'M');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'M');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 1) {
+                    // N...
+                    if(getIndexPlacement('N',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('N',placement)-2, getIndexPlacement('N',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('N',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'N')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'N');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'N');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 2) {
+                    // O...
+                    if(getIndexPlacement('O',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('O',placement)-2, getIndexPlacement('O',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('O',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'O')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'O');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'O');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 3) {
+                    // P...
+                    if(getIndexPlacement('P',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('P',placement)-2, getIndexPlacement('P',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('P',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'P')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'P');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'P');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 4) {
+                    //Q...
+                    if(getIndexPlacement('Q',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Q',placement)-2, getIndexPlacement('Q',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Q',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'Q')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Q');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'Q');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 5) {
+                    //R...
+                    if(getIndexPlacement('R',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('R',placement)-2, getIndexPlacement('R',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('R',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'R')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'R');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'R');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 0) {
+                    ////G
+                    if(getIndexPlacement('G',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('G',placement)-2, getIndexPlacement('G',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('G',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'G')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'G');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'G');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 1) {
+                    ////H...
+                    if(getIndexPlacement('H',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('H',placement)-2, getIndexPlacement('H',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('H',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'H')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'H');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'H');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 2) {
+                    ////I///
+                    if(getIndexPlacement('I',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('I',placement)-2, getIndexPlacement('I',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('I',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'I')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'I');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'I');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 3) {
+                    ////J////
+                    if(getIndexPlacement('J',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('J',placement)-2, getIndexPlacement('J',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('J',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'J')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'J');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'J');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 4) {
+                    /////K///
+                    if(getIndexPlacement('K',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('K',placement)-2, getIndexPlacement('K',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('K',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'K')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'K');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'K');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 5) {
+                    ////L////
+                    if(getIndexPlacement('L',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('L',placement)-2, getIndexPlacement('L',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('L',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'L')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'L');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'L');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 0) {
+                    /// A ///
+                    if(getIndexPlacement('A',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('A',placement)-2, getIndexPlacement('A',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('A',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'A')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'A');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'A');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 1) {
+                    ///B/////
+                    if(getIndexPlacement('B',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('B',placement)-2, getIndexPlacement('B',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('B',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'B')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'B');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'B');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 2) {
+                    /// C/////
+                    if(getIndexPlacement('C',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('C',placement)-2, getIndexPlacement('C',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('C',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'C')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'C');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'C');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 3) {
+                    ////D////
+                    if(getIndexPlacement('D',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('D',placement)-2, getIndexPlacement('D',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('D',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'D')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'D');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'D');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 4) {
+                    ////E////
+                    if(getIndexPlacement('E',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('E',placement)-2, getIndexPlacement('E',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('E',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'E')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'E');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'E');
+
+                                        players1 = new TextField();
+                                        players1.setText(supporters1);
+                                        //System.out.println(players1.getText());
+                                        root.getChildren().add(players1);
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 5) {
+                    /////F/////
+                    if(getIndexPlacement('F',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('F',placement)-2, getIndexPlacement('F',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('F',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'F')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'F');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        supporters1 = WarringStatesGame.getSupporters(begin,movesequence,2,0);
+                                        supporters2 = WarringStatesGame.getSupporters(begin,movesequence,2,1);
+                                        System.out.println(supporters1 + "|"+supporters2);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'F');
+
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+
+                }
+
+                root.getChildren().add(square);
+
+                root.getChildren().add(text);
+
+
+            }
+
+            //String[] placements = new String[placement.length()];
+            //for (int i = 0; i < placement.length() ; i++) {
+            //  placements[i] = String.valueOf(placement.charAt(i));
+            // Character name = placement.charAt(3 * i);
+            //Character movement = placement.charAt((3 * i) + 1); //get the moved character
+            //Character location = placement.charAt((3 * i) + 2); //get the located character
+        }
+    }
+
+            /*public void rect (Stage primarystage){
+            AnchorPane root = new AnchorPane();
+            Scene scene = new Scene(root);
+            stage.setScene(scene);
+
+            int columns = 6, rows = 6;
+            Rectangle rec = null;
+            for (int i = 0; i < columns; i++) {
+                for (int j = 0; j < rows; j++) {
+
+                    rec.setStroke(Color.RED);
+
+                    root.getChildren().add(rec);
+                }
+            }
+        }
+        scene.setRoot(root);
+        stage.show();*/
+
+    /**
+     * Create a basic text field for input and a refresh button.
+     */
+   /* private void makeControls() {
+        Label label1 = new Label("Placement:");
+        textField = new TextField();
+        textField.setPrefWidth(300);
+        Button button = new Button("Refresh");
+        button.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent e) {
+                String placement = textField.getText();
+                textField.clear();
+            }
+        });
+// enter the number
+        textField.setOnKeyPressed((KeyEvent p) -> {
+            if (p.getCode() == KeyCode.ENTER) {
+                String placement = textField.getText();
+                textField.clear();
+            }
+        });
+        HBox hb = new HBox();
+        hb.getChildren().addAll(label1, textField, button);
+        hb.setSpacing(10);
+        hb.setLayoutX(130);
+        hb.setLayoutY(VIEWER_HEIGHT - 50);
+        controls.getChildren().add(hb);
+    }
+*/
+    /* public void makeLocation(String placement) {
+         for (int i = 0; i < placement.length() / 3; i++) {
+             String country = placement.substring(i, i + 3);
+             char location = country.charAt(0);
+             char name = country.charAt(1);
+             if (location <= 10) {
+
+             }
+             Rectangle square = new Rectangle(location % 6 , location / 6 , 90, 90);
+             Text text = new Text();
+             text.setLayoutX(500 + 50);
+             text.setLayoutY(500 + 50);
+
+             if (name == 'a') {
+                 square.setFill(Color.RED);
+             } else if (name == 'b') {
+                 square.setFill(Color.GRAY);
+
+             }
+         }
+
+     }*/
+    int getIndexPlacement(Character p,String pl){
+        int i = 0;
+        int j =0;
+        for( i = 2; i <pl.length();i=i+3){
+            if(pl.charAt(i)==p){
+                j = i;
+            }
+        }
+        return j;
+    }
+    String takeKingdom(String p){
+        String s ="";
+        switch (p){
+            case "a":
+                s = "0x0000FF";
+                break;
+            case "b":
+                s = "#ffff00";
+                break;
+            case "c":
+                s = "#00ff00";
+                break;
+            case "d":
+                s = "#660033";
+                break;
+            case "e":
+                s = "#cc00cc";
+                break;
+            case "f":
+                s= "#ff0000";
+                break;
+            case "g":
+                s = "#cc3300";
+                break;
+            case "z":
+                s= "#000000";
+
+        }
+        return s;
+    }
+    String takeCharacter(String p){
+        String charcaterName = "";
+        if(p.charAt(0)=='a'){
+            // qin
+            if(p.charAt(1)=='0'){
+                charcaterName = "Lady Zhao";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Hui";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Lady Mi";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "King Zhaoxiang";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Duke Xiao";
+            }else if(p.charAt(1)=='5'){
+                charcaterName = "King Zhen";
+            }else if(p.charAt(1)=='6'){
+                charcaterName = "Bai Qi";
+            }else if(p.charAt(1)=='7'){
+                charcaterName = "Shang Yang";
+            }
+        }else if(p.charAt(0)=='b'){
+            // qi
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Xuan";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Xian";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Queen Junwang";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "King Jian";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Zhong Wuyan";
+            }else if(p.charAt(1)=='5'){
+                charcaterName = "Lord Menchang";
+            }else if(p.charAt(1)=='6'){
+                charcaterName = "Sun Bin";
+            }
+        }
+        else if(p.charAt(0)=='c'){
+            // chu
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Kaolie";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Ai";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Fu Chu";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "King You";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Wu Qi";
+            }else if(p.charAt(1)=='5'){
+                charcaterName = "Lord Chunshen";
+            }
+        }else if(p.charAt(0)=='d'){
+            // zhao
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Xiaocheng";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Wuling";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Lord Pingyuan";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "Li Mu";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Lian Po";
+            }
+        }else if(p.charAt(0)=='e'){
+            // han
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Huanhui";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King An";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Marquess Ai";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "Han Fei";
+            }
+        }else if(p.charAt(0)=='f'){
+            //wei
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Anxi";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "Lord Xinling";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Marquess Wei";
+            }
+        }else if(p.charAt(0)=='g'){
+            // yan
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Xi";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "Prince Dan";
+            }
+        }else{
+            charcaterName = "Zhang Yi";
+        }
+
+        return charcaterName;
+    }
+
+    public static String generateRandomSetup() {
+        List<String> cards = new ArrayList<>();
+        for (char k = 'a'; k < 'h'; k++) {
+            for (char c = '0'; c < 8 - (k - 'a') + '0'; c++) {
+                cards.add("" + k + c);
+            }
+        }
+        Collections.shuffle(cards);
+        StringBuilder sb = new StringBuilder();
+        int location = 0;
+        for (String card : cards) {
+            sb.append(card).append(location < 26 ? location + 'a' : location - 26 + '0');
+            location++;
+        }
+        return sb.toString();
+    }
+
     @Override
     public void start(Stage primaryStage) throws Exception {
 
+
+        //setup = generateRandomSetup();
+        //System.out.println(setup);
+        setup = "b4Aa2Bz9Cf1Dd0Ea7Ff0Gb0Hb5Id4Jd2Kf2Lc3Mc4Nd1Oa0Pa1Qa4Re2Se1Tc5Uc0Vg0Wb6Xb1Ya3Za60d31c22a53b24e35g16e07b38c19";
+        //setup = "g1Aa0Bc0Ce0De3Ed4Fb6Ga4Hg0Ib5Ja7Kb1Lz9Me1Nd0Of0Pf1Qb2Rc1Sd3Ta5Ub4Va2Wc5Xd1Ya3Zc20d21c32f23a64c45b36b07a18e29";
+
+        begin = setup;
+
+        //System.out.println(setup);
+        makePlacement(setup);
+
+
+
+      /*  ToolBar t1=new ToolBar();
+        RadioButton rEasy = new RadioButton("Easy");
+        RadioButton rMedium = new RadioButton("Medium");
+        RadioButton rHard = new RadioButton("Hard");
+        ToggleGroup groupDifficulty = new ToggleGroup();
+        groupDifficulty.getToggles().addAll(rEasy, rMedium, rHard);
+
+        ToolBar t2 = new ToolBar();
+        t2.setOrientation(Orientation.VERTICAL);
+        t2.getItems().addAll(new Separator(), rEasy, rMedium, rHard, new Separator());
+
+        BorderPane bp=new BorderPane();
+        bp.setBottom(t1);
+        bp.setBottom(t2);
+        Scene scene2= new Scene(bp, 600, 300);
+        primaryStage.setScene(scene2);
+        primaryStage.show();*/
+
+       /* String musicFile= new File("assets/Tone.mp3").toURI().toString();
+        MediaPlayer mediaPlayer=new MediaPlayer(new Media(musicFile));
+        mediaPlayer.play();
+*/
+
+        Label label1 = new Label("Placement:");
+        textField = new TextField();
+        textField.setPrefWidth(300);
+
+        Button button = new Button("Refresh");
+        button.setOnAction(new EventHandler<ActionEvent>() {
+                               @Override
+                               public void handle(ActionEvent e) {
+                                   setup="d4Ad1Ba7Cb3Db1Ee1Fd3Gc3Hb6Ic2Ja2Kf0Lc5Me3Ng0Oz9Pd2Qg1Rc0Sa5Tb4Ud0Va1Wf2Xe2Ya6Za40b01b22b53e04a05a36c17f18c49";
+                                   makePlacement(setup);
+                               }
+                           }
+        );
+
+        //makePlacement(setup);
+
+// enter the number
+        textField.setOnKeyPressed((KeyEvent p) -> {
+            if (p.getCode() == KeyCode.ENTER) {
+                makePlacement(textField.getText());
+                textField.clear();
+            }
+        });
+
+        /*TextField kingdomRecord = new TextField();
+        kingdomRecord.setText(kingdom);
+*/
+
+        HBox hb = new HBox();
+        hb.getChildren().addAll(label1, textField, button);
+        hb.setSpacing(10);
+        hb.setLayoutX(130);
+        hb.setLayoutY(VIEWER_HEIGHT - 50);
+        controls.getChildren().add(hb);
+        AnchorPane anchorPane = new AnchorPane();
+        //Group group = new Group();
+        primaryStage.setTitle("Warring States Game");
+        squareg.setStyle("-fx-background-color: #C0C0C0;");
+
+        final Scene scene = new Scene(root, 1000, 1000, Color.LAVENDER);
+
+        root.getChildren().add(controls);
+        //root.getChildren().add(players1);
+
+        BorderPane pane = new BorderPane();
+
+        int count_col = 6;
+        int count_row = 6;
+        boolean evenflag = true;
+
+        Label label=new Label("Not clicked");
+        Button button1= new Button("Easy");
+        button1.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent event) {
+                label.setText("CLICKED");
+            }
+        });
+
+        primaryStage.setScene(scene);
+        primaryStage.show();
+
+
     }
 }
 
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$10.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$11.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$12.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$13.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$14.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$15.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$16.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$17.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$18.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$19.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$20.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$21.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$22.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$23.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$24.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$25.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$26.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$27.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$28.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$29.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$2.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$30.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$31.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$32.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$33.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$34.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$35.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$36.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$37.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$38.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$3.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$4.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$5.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$6.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$7.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$8.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$9.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2018-05-18 08:54:16.593376370 +1000
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2018-05-18 09:58:06.225384658 +1000
@@ -1,15 +1,35 @@
 package comp1110.ass2.gui;
 
+import comp1110.ass2.WarringStatesGame;
+import gittest.C;
 import javafx.application.Application;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 import javafx.scene.Group;
 import javafx.scene.Scene;
-import javafx.scene.control.Button;
-import javafx.scene.control.Label;
-import javafx.scene.control.TextField;
+import javafx.scene.control.*;
+import javafx.scene.image.Image;
+import javafx.scene.input.KeyCode;
+import javafx.scene.input.KeyEvent;
+import javafx.scene.input.MouseEvent;
+import javafx.scene.layout.AnchorPane;
+import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.HBox;
+import javafx.scene.layout.StackPane;
+import javafx.scene.media.Media;
+import javafx.scene.media.MediaPlayer;
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Rectangle;
+import javafx.scene.text.Font;
+import javafx.scene.text.Text;
 import javafx.stage.Stage;
+import javafx.scene.image.Image;
+
+import java.io.File;
+import java.util.ArrayList;
+import java.util.Collections;
+import java.util.List;
+import java.util.Scanner;
 
 /**
  * A very simple viewer for card layouts in the Warring States game.
@@ -26,21 +46,1015 @@
 
     private final Group root = new Group();
     private final Group controls = new Group();
+    private final Group squareg = new Group();
+    private final Group pieces = new Group();
+    private boolean isGameOver;
+
+    private boolean triagger = false;
+
+    private double x;
+    private double y;
+
     TextField textField;
 
+    public String setup;
+    //public String place;
+
+    public String kingdom;
+
+    public String movesequence = "";
+    public String supporters;
+
+
+    /*char mousePlace(){
+        char c ='.';
+        if((x >= 100 && x<=200) && (y>=300 && y<=400) ){
+            c = '1';
+        }
+        return c;
+    }*/
+
     /**
      * Draw a placement in the window, removing any previously drawn one
      *
      * @param placement A valid placement string
      */
+    //Idea- Ruiyi Sun and Akshat Singhal
+    //Author- Shunyu Yao, Ruiyi Sun and Akshat Singhal
+
+
+
     void makePlacement(String placement) {
         // FIXME Task 4: implement the simple placement viewer
+
+        this.pieces.getChildren().clear();// clearing pieces
+
+        while (root.getChildren().size() >= 36)// input string less than 36
+            root.getChildren().remove(root.getChildren().size() - 1);
+
+
+
+        placement = placement;
+        for (int i = 0; i < 6; i++) {
+            for (int j = 0; j < 6; j++) {
+                Rectangle square = new Rectangle(i * 100, j * 100, 90, 90);
+                Text text = new Text();
+                text.setLayoutX(i * 100 + 5);
+                text.setLayoutY(j * 100 + 50);
+
+
+                if (i == 0 && j == 0) {
+                    //4 is the location of card on the board
+                    if(getIndexPlacement('4',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('4',placement)-2, getIndexPlacement('4',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('4',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'4')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'4');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'4');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 1) {
+                    //5 is the location of card on the board
+                    if(getIndexPlacement('5',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('5',placement)-2, getIndexPlacement('5',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('5',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'5')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'5');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'5');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 2) {
+                    //6...
+                    if(getIndexPlacement('6',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('6',placement)-2, getIndexPlacement('6',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('6',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'6')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'6');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'6');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 3) {
+                    //7...
+                    if(getIndexPlacement('7',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('7',placement)-2, getIndexPlacement('7',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('7',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'7')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'7');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'7');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 0 && j == 4) {
+                    //8...
+                    if(getIndexPlacement('8',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('8',placement)-2, getIndexPlacement('8',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('8',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'8')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'8');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'8');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+
+                } else if (i == 0 && j == 5) {
+                    //9...
+                    if(getIndexPlacement('9',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('9',placement)-2, getIndexPlacement('9',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('9',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'9')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'9');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'9');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 1 && j == 1) {
+                    // Z...
+                    if(getIndexPlacement('Z',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Z',placement)-2, getIndexPlacement('Z',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Z',placement)-2)))));
+
+                        if(WarringStatesGame.isMoveLegal(setup,'Z')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+
+                                public void handle(MouseEvent me) {
+                                    //placement = WarringStatesGame.updatePlacement(placement,'2','4');
+                                    /*x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    System.out.println("click");*/
+
+                                    if(triagger){
+                                        //if(WarringStatesGame.isMoveLegal(setup,'1')){
+                                        //System.out.println(triagger);
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Z');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'Z');
+                                        //place = setup;
+                                        makePlacement(setup);
+                                        System.out.println(setup);
+
+
+                                    }
+                                }
+                            });
+                        }
+
+
+                    }
+
+                } else if (i == 1 && j == 2) {
+                    // 0...
+                    if(getIndexPlacement('0',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('0',placement)-2, getIndexPlacement('0',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('0',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'0')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'0');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'0');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 1 && j == 3) {
+                    // 1...
+                    if(getIndexPlacement('1',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('1',placement)-2, getIndexPlacement('1',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('1',placement)-2)))));
+
+                        if(WarringStatesGame.isMoveLegal(placement,'1')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'1');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'1');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }
+
+
+                    }
+                } else if (i == 1 && j == 0) {
+                    // Y...
+                    if(getIndexPlacement('Y',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Y',placement)-2, getIndexPlacement('Y',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Y',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'Y')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    if(triagger){
+
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Y');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        //supporters = WarringStatesGame.getSupporters(setup,movesequence,1,0);
+                                        //System.out.println(supporters);
+
+
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'Y');
+                                        makePlacement(setup);
+
+                                    }
+                                }
+                            });
+                        }}
+
+                } else if (i == 1 && j == 4) {
+                    //2...
+                    if(getIndexPlacement('2',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('2',placement)-2, getIndexPlacement('2',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('2',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'2')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Z');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'2');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                        text.setFill(Color.WHITE);
+                } else if (i == 1 && j == 5) {
+                    //3
+                    if(getIndexPlacement('3',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('3',placement)-2, getIndexPlacement('3',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('3',placement)-2)))));
+
+
+                        if(WarringStatesGame.isMoveLegal(setup,'3')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+
+                                public void handle(MouseEvent me) {
+                                    //placement = WarringStatesGame.updatePlacement(placement,'2','4');
+                                   /* x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;*/
+                                    //System.out.println("click");
+                                    if(triagger){
+                                        //if(WarringStatesGame.isMoveLegal(setup,'1')){
+                                        //System.out.println(triagger);
+
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'3');
+                                        //System.out.println(index);
+                                        /*kingdom = setup.substring(index, index+2);
+                                        System.out.println(kingdom);
+                                        System.out.println(setup.substring(index+2,index+3));*/
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        //System.out.println(movesequence);
+
+
+
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'3');
+                                        //place = setup;
+                                        makePlacement(setup);
+                                        //System.out.println(setup);
+
+
+
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 2) {
+                    //U
+                    if(getIndexPlacement('U',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('U',placement)-2, getIndexPlacement('U',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('U',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'U')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'U');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'U');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 0) {
+                    //S...
+                    if(getIndexPlacement('S',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('S',placement)-2, getIndexPlacement('S',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('S',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'S')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'S');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'S');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 1) {
+                    //T...
+                    if(getIndexPlacement('T',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('T',placement)-2, getIndexPlacement('T',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('T',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'T')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'T');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'T');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 3) {
+                    //V...
+                    if(getIndexPlacement('V',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('V',placement)-2, getIndexPlacement('V',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('V',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'V')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'V');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'V');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 4) {
+                    //W...
+                    if(getIndexPlacement('W',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('W',placement)-2, getIndexPlacement('W',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('W',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'W')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'W');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'W');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 2 && j == 5) {
+                    //X...
+                    if(getIndexPlacement('X',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('X',placement)-2, getIndexPlacement('X',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('X',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'X')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'X');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'X');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+
+                } else if (i == 3 && j == 0) {
+                    // M...
+                    if(getIndexPlacement('M',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('M',placement)-2, getIndexPlacement('M',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('M',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'M')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'M');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'M');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 1) {
+                    // N...
+                    if(getIndexPlacement('N',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('N',placement)-2, getIndexPlacement('N',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('N',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'N')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'N');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'N');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 2) {
+                    // O...
+                    if(getIndexPlacement('O',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('O',placement)-2, getIndexPlacement('O',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('O',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'O')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'O');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'O');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 3) {
+                    // P...
+                    if(getIndexPlacement('P',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('P',placement)-2, getIndexPlacement('P',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('P',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'P')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'P');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'P');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 4) {
+                    //Q...
+                    if(getIndexPlacement('Q',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('Q',placement)-2, getIndexPlacement('Q',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('Q',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'Q')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'Q');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'Q');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 3 && j == 5) {
+                    //R...
+                    if(getIndexPlacement('R',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('R',placement)-2, getIndexPlacement('R',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('R',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'R')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'R');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'R');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 0) {
+                    ////G
+                    if(getIndexPlacement('G',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('G',placement)-2, getIndexPlacement('G',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('G',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'G')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'G');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'G');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 1) {
+                    ////H...
+                    if(getIndexPlacement('H',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('H',placement)-2, getIndexPlacement('H',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('H',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'H')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'H');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'H');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 2) {
+                    ////I///
+                    if(getIndexPlacement('I',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('I',placement)-2, getIndexPlacement('I',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('I',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'I')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'I');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'I');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 3) {
+                    ////J////
+                    if(getIndexPlacement('J',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('J',placement)-2, getIndexPlacement('J',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('J',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'J')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'J');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'J');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 4) {
+                    /////K///
+                    if(getIndexPlacement('K',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('K',placement)-2, getIndexPlacement('K',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('K',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'K')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'K');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'K');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 4 && j == 5) {
+                    ////L////
+                    if(getIndexPlacement('L',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('L',placement)-2, getIndexPlacement('L',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('L',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'L')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'L');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'L');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 0) {
+                    /// A ///
+                    if(getIndexPlacement('A',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('A',placement)-2, getIndexPlacement('A',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('A',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'A')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'A');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'A');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 1) {
+                    ///B/////
+                    if(getIndexPlacement('B',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('B',placement)-2, getIndexPlacement('B',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('B',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'B')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'B');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'B');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 2) {
+                    /// C/////
+                    if(getIndexPlacement('C',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('C',placement)-2, getIndexPlacement('C',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('C',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'C')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'C');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'C');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 3) {
+                    ////D////
+                    if(getIndexPlacement('D',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('D',placement)-2, getIndexPlacement('D',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('D',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'D')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'D');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'D');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 4) {
+                    ////E////
+                    if(getIndexPlacement('E',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('E',placement)-2, getIndexPlacement('E',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('E',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'E')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'E');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'E');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+                } else if (i == 5 && j == 5) {
+                    /////F/////
+                    if(getIndexPlacement('F',placement)==0){
+                        square.setFill(Color.WHITE);
+                    }else{
+                        text.setText(takeCharacter(placement.substring(getIndexPlacement('F',placement)-2, getIndexPlacement('F',placement)+1)));
+                        square.setFill(Color.web(takeKingdom(String.valueOf(placement.charAt(getIndexPlacement('F',placement)-2)))));
+                        if(WarringStatesGame.isMoveLegal(placement,'F')){
+                            square.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
+                                public void handle(MouseEvent me) {
+                                    x = me.getX();
+                                    y = me.getY();
+                                    triagger = true;
+                                    if(triagger){
+                                        int index = WarringStatesGame.getIndexKingdom(setup,'F');
+                                        char location = setup.substring(index+2,index+3).charAt(0);
+                                        movesequence = movesequence + location;
+                                        System.out.println(movesequence);
+                                        setup = WarringStatesGame.updatePlacement(setup,WarringStatesGame.zhangyilocation(setup),'F');
+                                        makePlacement(setup);
+                                    }
+                                }
+                            });
+                        }}
+
+                }
+
+                root.getChildren().add(square);
+
+                root.getChildren().add(text);
+
+
+            }
+
+            //String[] placements = new String[placement.length()];
+            //for (int i = 0; i < placement.length() ; i++) {
+            //  placements[i] = String.valueOf(placement.charAt(i));
+            // Character name = placement.charAt(3 * i);
+            //Character movement = placement.charAt((3 * i) + 1); //get the moved character
+            //Character location = placement.charAt((3 * i) + 2); //get the located character
+        }
     }
 
+            /*public void rect (Stage primarystage){
+            AnchorPane root = new AnchorPane();
+            Scene scene = new Scene(root);
+            stage.setScene(scene);
+
+            int columns = 6, rows = 6;
+            Rectangle rec = null;
+            for (int i = 0; i < columns; i++) {
+                for (int j = 0; j < rows; j++) {
+
+                    rec.setStroke(Color.RED);
+
+                    root.getChildren().add(rec);
+                }
+            }
+        }
+        scene.setRoot(root);
+        stage.show();*/
+
     /**
      * Create a basic text field for input and a refresh button.
      */
-    private void makeControls() {
+   /* private void makeControls() {
         Label label1 = new Label("Placement:");
         textField = new TextField();
         textField.setPrefWidth(300);
@@ -48,7 +1062,14 @@
         button.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent e) {
-                makePlacement(textField.getText());
+                String placement = textField.getText();
+                textField.clear();
+            }
+        });
+// enter the number
+        textField.setOnKeyPressed((KeyEvent p) -> {
+            if (p.getCode() == KeyCode.ENTER) {
+                String placement = textField.getText();
                 textField.clear();
             }
         });
@@ -59,17 +1080,287 @@
         hb.setLayoutY(VIEWER_HEIGHT - 50);
         controls.getChildren().add(hb);
     }
+*/
+    /* public void makeLocation(String placement) {
+         for (int i = 0; i < placement.length() / 3; i++) {
+             String country = placement.substring(i, i + 3);
+             char location = country.charAt(0);
+             char name = country.charAt(1);
+             if (location <= 10) {
+
+             }
+             Rectangle square = new Rectangle(location % 6 , location / 6 , 90, 90);
+             Text text = new Text();
+             text.setLayoutX(500 + 50);
+             text.setLayoutY(500 + 50);
+
+             if (name == 'a') {
+                 square.setFill(Color.RED);
+             } else if (name == 'b') {
+                 square.setFill(Color.GRAY);
+
+             }
+         }
+
+     }*/
+    int getIndexPlacement(Character p,String pl){
+        int i = 0;
+        int j =0;
+        for( i = 2; i <pl.length();i=i+3){
+            if(pl.charAt(i)==p){
+                j = i;
+            }
+        }
+        return j;
+    }
+    String takeKingdom(String p){ //setting the colors for the kingdoms
+        String s ="";
+        switch (p){
+            case "a":
+                s = "0x0000FF";
+                break;
+            case "b":
+                s = "#ffff00";
+                break;
+            case "c":
+                s = "#00ff00";
+                break;
+            case "d":
+                s = "#660033";
+                break;
+            case "e":
+                s = "#cc00cc";
+                break;
+            case "f":
+                s= "#ff0000";
+                break;
+            case "g":
+                s = "#cc3300";
+                break;
+            case "z":
+                s= "#000000";
+
+        }
+        return s;
+    }
+    String takeCharacter(String p){ //giving names
+        String charcaterName = "";
+        if(p.charAt(0)=='a'){
+            // qin
+            if(p.charAt(1)=='0'){
+                charcaterName = "Lady Zhao";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Hui";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Lady Mi";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "King Zhaoxiang";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Duke Xiao";
+            }else if(p.charAt(1)=='5'){
+                charcaterName = "King Zhen";
+            }else if(p.charAt(1)=='6'){
+                charcaterName = "Bai Qi";
+            }else if(p.charAt(1)=='7'){
+                charcaterName = "Shang Yang";
+            }
+        }else if(p.charAt(0)=='b'){
+            // qi
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Xuan";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Xian";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Queen Junwang";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "King Jian";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Zhong Wuyan";
+            }else if(p.charAt(1)=='5'){
+                charcaterName = "Lord Menchang";
+            }else if(p.charAt(1)=='6'){
+                charcaterName = "Sun Bin";
+            }
+        }
+        else if(p.charAt(0)=='c'){
+            // chu
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Kaolie";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Ai";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Fu Chu";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "King You";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Wu Qi";
+            }else if(p.charAt(1)=='5'){
+                charcaterName = "Lord Chunshen";
+            }
+        }else if(p.charAt(0)=='d'){
+            // zhao
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Xiaocheng";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King Wuling";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Lord Pingyuan";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "Li Mu";
+            }else if(p.charAt(1)=='4'){
+                charcaterName = "Lian Po";
+            }
+        }else if(p.charAt(0)=='e'){
+            // han
+            if(p.charAt(1)=='0'){
+               charcaterName = "King Huanhui";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "King An";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Marquess Ai";
+            }else if(p.charAt(1)=='3'){
+                charcaterName = "Han Fei";
+            }
+        }else if(p.charAt(0)=='f'){
+            //wei
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Anxi";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "Lord Xinling";
+            }else if(p.charAt(1)=='2'){
+                charcaterName = "Marquess Wei";
+            }
+        }else if(p.charAt(0)=='g'){
+            // yan
+            if(p.charAt(1)=='0'){
+                charcaterName = "King Xi";
+            }else if(p.charAt(1)=='1'){
+                charcaterName = "Prince Dan";
+            }
+        }else{
+            charcaterName = "Zhang Yi";
+        }
+
+        return charcaterName;
+    }
+
+    public static String generateRandomSetup() {
+        List<String> cards = new ArrayList<>();
+        for (char k = 'a'; k < 'h'; k++) {
+            for (char c = '0'; c < 8 - (k - 'a') + '0'; c++) {
+                cards.add("" + k + c);
+            }
+        }
+        Collections.shuffle(cards);
+        StringBuilder sb = new StringBuilder();
+        int location = 0;
+        for (String card : cards) {
+            sb.append(card).append(location < 26 ? location + 'a' : location - 26 + '0');
+            location++;
+        }
+        return sb.toString();
+    }
 
     @Override
     public void start(Stage primaryStage) throws Exception {
+
+
+        //setup = generateRandomSetup();
+        //System.out.println(setup);
+        setup = "g0Aa0Bf1Ca1Dc5Ee1Fa4Ge3He2Ia2Jc2Kd0Lf0Mb4Nd4Oa6Pc3Qe0Ra5Sc1Td1Uc4Vb5Wb0Xa7Yf2Zb10a31z92b33b64d35g16b27d28c09";
+        //setup = "g1Aa0Bc0Ce0De3Ed4Fb6Ga4Hg0Ib5Ja7Kb1Lz9Me1Nd0Of0Pf1Qb2Rc1Sd3Ta5Ub4Va2Wc5Xd1Ya3Zc20d21c32f23a64c45b36b07a18e29";
+
+
+        //System.out.println(setup);
+        makePlacement(setup);
+
+
+
+      /*  ToolBar t1=new ToolBar();
+        RadioButton rEasy = new RadioButton("Easy");
+        RadioButton rMedium = new RadioButton("Medium");
+        RadioButton rHard = new RadioButton("Hard");
+        ToggleGroup groupDifficulty = new ToggleGroup();
+        groupDifficulty.getToggles().addAll(rEasy, rMedium, rHard);
+
+        ToolBar t2 = new ToolBar();
+        t2.setOrientation(Orientation.VERTICAL);
+        t2.getItems().addAll(new Separator(), rEasy, rMedium, rHard, new Separator());
+
+        BorderPane bp=new BorderPane();
+        bp.setBottom(t1);
+        bp.setBottom(t2);
+        Scene scene2= new Scene(bp, 600, 300);
+        primaryStage.setScene(scene2);
+        primaryStage.show();*/
+
+        String musicFile= new File("assets/Tone.mp3").toURI().toString(); //a music file to be played at the starting of the game
+        MediaPlayer mediaPlayer=new MediaPlayer(new Media(musicFile));
+        mediaPlayer.play();
+
+
+        Label label1 = new Label("Placement:");
+        textField = new TextField();
+        textField.setPrefWidth(300);
+
+        Button button = new Button("Refresh");
+        button.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent e) {
+                setup="d4Ad1Ba7Cb3Db1Ee1Fd3Gc3Hb6Ic2Ja2Kf0Lc5Me3Ng0Oz9Pd2Qg1Rc0Sa5Tb4Ud0Va1Wf2Xe2Ya6Za40b01b22b53e04a05a36c17f18c49";
+                makePlacement(setup);
+                }
+                }
+        );
+
+        //makePlacement(setup);
+
+// enter the number
+        textField.setOnKeyPressed((KeyEvent p) -> {
+            if (p.getCode() == KeyCode.ENTER) {
+                makePlacement(textField.getText());
+                textField.clear();
+            }
+        });
+
+        /*TextField kingdomRecord = new TextField();
+        kingdomRecord.setText(kingdom);
+*/
+
+        HBox hb = new HBox();
+        hb.getChildren().addAll(label1, textField, button);
+        hb.setSpacing(10);
+        hb.setLayoutX(130);
+        hb.setLayoutY(VIEWER_HEIGHT - 50);
+        controls.getChildren().add(hb);
+        AnchorPane anchorPane = new AnchorPane();
+        Group group = new Group();
         primaryStage.setTitle("Warring States Viewer");
-        Scene scene = new Scene(root, VIEWER_WIDTH, VIEWER_HEIGHT);
+        squareg.setStyle("-fx-background-color: #C0C0C0;");
+
+        final Scene scene = new Scene(root, 1000, 1000, Color.LAVENDER);
 
         root.getChildren().add(controls);
 
-        makeControls();
+        BorderPane pane = new BorderPane();
+
+        int count_col = 6;
+        int count_row = 6;
+        boolean evenflag = true;
+
+        Label label=new Label("Not clicked");
+        Button button1= new Button("Easy");
+        button1.setOnAction(new EventHandler<ActionEvent>() {
+            @Override
+            public void handle(ActionEvent event) {
+                label.setText("CLICKED");
+            }
+        });
 
         primaryStage.setScene(scene);
         primaryStage.show();
+
+
     }
 }
+
Only in comp1110-ass2/src/comp1110/ass2: WarringStatesGame.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java
--- ../master/comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java	2018-05-18 08:54:16.569376239 +1000
+++ comp1110-ass2/src/comp1110/ass2/WarringStatesGame.java	2018-05-18 09:58:06.189384467 +1000
@@ -1,5 +1,10 @@
 package comp1110.ass2;
 
+import java.util.Arrays;
+import java.util.Collections;
+import java.util.HashMap;
+import java.util.Map;
+
 /**
  * This class provides the text interface for the Warring States game
  */
@@ -15,9 +20,91 @@
      * @param cardPlacement A string describing a card placement
      * @return true if the card placement is well-formed
      */
+    //Idea- Shunyu Yao, Ruiyi Sun and Akshat Singhal
+    //Author- Shunyu Yao
     static boolean isCardPlacementWellFormed(String cardPlacement) {
         // FIXME Task 2: determine whether a card placement is well-formed
-        return false;
+        //or use the int = ascii;
+        boolean b1 = false;
+        boolean b2 = false;
+        boolean b3 = false;
+
+        if ((cardPlacement.charAt(0) >= 'a' && cardPlacement.charAt(0) <= 'g') || cardPlacement.charAt(0) == 'z') {
+            b1 = true;
+        } else {
+            b1 = false;
+        }// check the a-g kingdom and z9 (zhangyi)
+
+        // check if the card is correct
+        if (cardPlacement.charAt(0) == 'a') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '7') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'b') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '6') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'c') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '5') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'd') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '4') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'e') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '3') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'f') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '2') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'g') {
+            if (cardPlacement.charAt(1) >= '0' && cardPlacement.charAt(1) <= '1') {
+                b2 = true;
+            }
+        } else if (cardPlacement.charAt(0) == 'z') {
+            if (cardPlacement.charAt(1) == '9') {
+                b2 = true;
+            }
+        } else {
+            b2 = false;
+        }
+
+        // check the location of card
+        if ((cardPlacement.charAt(2) >= 'A' && cardPlacement.charAt(2) <= 'Z') || (cardPlacement.charAt(2) >= '0' && cardPlacement.charAt(2) <= '9')) {
+            b3 = true;
+        } else {
+            b3 = false;
+        }
+        // if the three bool is true, the task should be correct
+        if (b1 && b2 && b3) {
+            return true;
+        } else {
+            return false;
+        }
+    }
+    // get a string of card
+    static String[] getCardPlacement(String placement) {
+        String[] card = new String[placement.length() / 3];
+
+        if (placement.length() % 3 == 0) {
+            int j = 0;
+            for (int i = 0; i < placement.length(); i = i + 3) {
+                card[j] = placement.substring(i, i + 3);
+                j++;
+            }
+        }
+        return card;
+    }
+    // get the location of card
+    static char getCardLocation(String cardPlacement) {
+        return cardPlacement.charAt(2);
+    }
+    // get the card string <a-g><0-7>
+    static String getCardStates(String cardPlacement) {
+        return cardPlacement.substring(0, 2);
     }
 
     /**
@@ -30,9 +117,87 @@
      * @param placement A string describing a placement of one or more cards
      * @return true if the placement is well-formed
      */
+    //Idea- Shunyu Yao
+    //Author- Shunyu Yao
     static boolean isPlacementWellFormed(String placement) {
         // FIXME Task 3: determine whether a placement is well-formed
-        return false;
+        //check the length of the characters
+        //check the characters one by one
+        //using count and check if the card is appearing once
+        //could use hash set to see if the location has one card
+
+        boolean b0 = false;
+        boolean b1 = false;
+        boolean b2 = false;
+        boolean b3 = false;
+
+
+        if (placement != null && placement != "") {
+
+            b0 = true;
+
+            if (placement.length() % 3 == 0) {
+
+                int countb1 = 0;
+                int countb2 = 0;
+                int countb3 = 0;
+
+                for (int i = 0; i < placement.length() / 3; i = i + 3) {
+                    b1 = isCardPlacementWellFormed(placement.substring(i, i + 3));
+                    if (b1 == false) {
+                        countb1++;
+                    }
+                }
+                if (countb1 == 0) {
+                    b1 = true;
+                }
+
+                String[] card = getCardPlacement(placement);
+
+                String[] cardstate = new String[placement.length() / 3];
+                char[] cardlocation = new char[placement.length() / 3];
+
+                for (int i = 0; i < card.length; i++) {
+                    cardstate[i] = getCardStates(card[i]);
+                    cardlocation[i] = getCardLocation(card[i]);
+                }
+
+                for (int i = 0; i < cardstate.length; i++) {
+                    for (int j = i + 1; j < cardstate.length; j++) {
+                        if (cardstate[i].equals(cardstate[j])) {
+                            countb2++;
+                        }
+                    }
+                }
+                if (countb2 == 0) {
+                    b2 = true;
+                }
+
+                for (int i = 0; i < cardlocation.length; i++) {
+                    for (int j = i + 1; j < cardlocation.length; j++) {
+                        if (cardlocation[i] == cardlocation[j]) {
+                            countb3++;
+                        }
+                    }
+                }
+                if (countb3 == 0) {
+                    b3 = true;
+                }
+
+            }
+
+        } else {
+            b0 = false;
+        }
+
+
+
+        if (b0 && b1 && b2 && b3) {
+            return true;
+        } else {
+            return false;
+        }
+
     }
 
     /**
@@ -41,16 +206,117 @@
      * - there is a card at the chosen location;
      * - the location is in the same row or column of the grid as Zhang Yi's current position; and
      * - drawing a line from Zhang Yi's current location through the card at the chosen location,
-     *   there are no other cards along the line from the same kingdom as the chosen card
-     *   that are further away from Zhang Yi.
+     * there are no other cards along the line from the same kingdom as the chosen card
+     * that are further away from Zhang Yi.
+     *
      * @param placement    the current placement string
      * @param locationChar a location for Zhang Yi to move to
      * @return true if Zhang Yi may move to that location
      */
+    //Author- Shunyu Yao
     public static boolean isMoveLegal(String placement, char locationChar) {
         // FIXME Task 5: determine whether a given move is legal
+        //check the third character of the string placement whether it's equals a-z or 0-9 check the third character of the string placement equals to locationChar compares the third character of the string placement and the locationChar..compares the third character and then compares the second character of the string placement whether there are the same.
+        String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";// the location string
+        if (c.indexOf(locationChar) >= 0) {
+            // check the zhangyi in the range of 0-9 or A-Z
+            // check char location and the zhangyi in the same line
+            if (getLine(locationChar, placement) && c.indexOf(zhangyilocation(placement)) >= 0 && isInSameLine(zhangyilocation(placement), locationChar) && notNoCard(locationChar, placement)) {
+                return true;
+            }
+        }
         return false;
     }
+    // to find the location of zhangyi
+    public static char zhangyilocation(String placement) {
+        return placement.charAt(placement.indexOf('z') + 2);
+    }
+// to find the location of card
+    public static char locationC(char locationChar, String placement) {
+        for (int q = 2; q < placement.length(); q = q + 3) {
+            if (placement.charAt(q) == locationChar) {
+                return placement.charAt(q - 2);
+            }
+        }
+        return '1';
+    }
+     // should zhangyi and the goal location in the same line
+    public static boolean isInSameLine(char zhangyilocation, char locationChar) {
+        String[] row = new String[]{"4YSMGA", "5ZTNHB", "60UOIC", "71VPJD", "82WQKE", "93XRLF"};
+        String[] column = new String[]{"ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
+        for (String s : row) {
+            // check the location should be the same line
+            if (s.indexOf(locationChar) >= 0 && s.indexOf(zhangyilocation) >= 0) {
+                return true;
+            }
+        }
+        for (String c : column) {
+            if (c.indexOf(locationChar) >= 0 && c.indexOf(zhangyilocation) >= 0) {
+                return true;
+            }
+        }
+        return false;
+    }
+// should the goal location empty
+    public static boolean notNoCard(char locationChar, String placement) {
+        for (int i = 2; i <= placement.length() - 1; i = i + 3) {
+            if (placement.charAt(i) == locationChar && placement.charAt(i - 2) != 'z') {
+                return true;
+            }
+        }
+        return false;
+    }
+// should the goal location fit the rule-- I mean it should be the furthest card
+    public static boolean getLine(char locationChar, String placement) {
+        //zhangyilocation(placement) should known
+        // the location of place
+        String[] s = new String[]{"AGMSY4", "BHNTZ5", "CIOU06", "DJPV17", "EKQW28", "FLRX39", "ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
+        for (String i : s) {
+            int distance = i.indexOf(zhangyilocation(placement)) - i.indexOf(locationChar);
+            int d = Math.abs(distance);
+            if (i.indexOf(locationChar) >= 0 && i.indexOf(zhangyilocation(placement)) >= 0) {
+                // find the string of zhangyi and next move
+                for (int k = 0; k < i.length(); k = k + 1) {
+                    for (int u = 2; u < placement.length(); u = u + 3) {
+                        if (i.indexOf(locationChar) >= i.indexOf(zhangyilocation(placement)) && k > i.indexOf(zhangyilocation(placement))) {
+                            if (i.charAt(k) == placement.charAt(u)) {
+                                if (placement.charAt(u - 2) == locationC(locationChar, placement)) {
+                                    int b1 = i.indexOf(zhangyilocation(placement)) - k;
+                                    int b2 = Math.abs(b1);
+                                    if (b2 > d) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        } else if (i.indexOf(locationChar) < i.indexOf(zhangyilocation(placement)) && k < i.indexOf(zhangyilocation(placement))) {
+                            if (i.charAt(k) == placement.charAt(u)) {
+                                if (placement.charAt(u - 2) == locationC(locationChar, placement)) {
+                                    int c1 = i.indexOf(zhangyilocation(placement)) - k;
+                                    int c2 = Math.abs(c1);
+                                    if (c2 > d) {
+                                        return false;
+                                    }
+                                }
+                            }
+                        }
+                    }
+                }
+            }
+
+        }
+        return true;
+    }
+// use known location in the card to get the index of the kingdom char in the card
+    public static int getIndexKingdom(String placement, char location){
+        int j = 0;
+        for(int i=2;i<placement.length();i=i+3){
+            if(placement.charAt(i) == location){
+                j = i-2;
+            }
+        }
+
+        return j;
+    }
 
     /**
      * Determine whether a move sequence is valid.
@@ -63,10 +329,101 @@
      * @param moveSequence a string of location characters representing moves
      * @return True if the placement sequence is valid
      */
+    //Author- Ruiyi Sun
     static boolean isMoveSequenceValid(String setup, String moveSequence) {
         // FIXME Task 6: determine whether a placement sequence is valid
-        return false;
+        // check if there is the same char in the moveSequence and the char in the moveSequence should be the char in setup
+        // use setup to create several strings as dictionaries for the a valid move
+        // for example row: "4YSMGA","5ZTNHB"... column: "ABCDEF","GHIJKL"
+        // check if first char and second char in the same string(row string or column)
+        // check all chars in the moveSequence and return true
+        boolean b = true;
+        String placement = setup;
+        for (int i = 0; i < moveSequence.length(); i++) {
+            if (isMoveLegal(placement, moveSequence.charAt(i))) {
+                placement = updatePlacement(placement, zhangyilocation(placement), moveSequence.charAt(i));
+
+            } else {
+                b = false;
+            }
+        }
+        if (b) {
+            return true;
+        } else {
+            return false;
+        }
     }
+    // to update the placement-- if there are several card be removed.
+    public static String updatePlacement(String placement, char zhangyilocation, char goallocation) {
+        StringBuilder sb = new StringBuilder(placement);
+        char goalState = locationC(goallocation, sb.toString());
+        if (sb.toString().indexOf('z') >= 0) {
+            sb.delete(sb.toString().indexOf('z'), sb.toString().indexOf('z') + 3);
+        }// delete the zhangyi card in previous location
+        String str = "";
+        String[] s = new String[]{"AGMSY4", "BHNTZ5", "CIOU06", "DJPV17", "EKQW28", "FLRX39", "ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
+        for (String st : s) {
+            if(st.indexOf(zhangyilocation) >= 0 && st.indexOf(goallocation) >= 0){
+                str =  str+st;
+                break;
+            }// check the same line string
+        }
+            int a = str.indexOf(zhangyilocation);
+            int b = str.indexOf(goallocation);
+            int f = Math.max(a,b);
+            int stt = Math.min(a,b);
+                for (int i = stt; i<=f; i++) {
+                        for (int j = 2; j < sb.toString().length(); j = j + 3) {
+                            if (sb.toString().charAt(j) == str.charAt(i)) {
+                                if (sb.toString().charAt(j - 2) == goalState && goallocation != sb.toString().charAt(j)) {
+                                    sb.delete((j - 2), j + 1);// delete the card has the same kingdom between zhangyi and goal location
+                                } else if (goallocation == sb.toString().charAt(j)) {
+                                    sb.setCharAt(j - 1, '9');
+                                    sb.setCharAt(j - 2, 'z');// add the zhangyi to the goal location
+                                }
+                                break;
+                            }
+                        }
+                }
+
+        return sb.toString();
+    }
+
+    public static String getStringInLine(char zhangyilocation,char goallocation){
+        String[] s = new String[]{"AGMSY4", "BHNTZ5", "CIOU06", "DJPV17", "EKQW28", "FLRX39", "ABCDEF", "GHIJKL", "MNOPQR", "STUVWX", "YZ0123", "456789"};
+        for (String str : s) {
+            if(str.indexOf(zhangyilocation) >= 0 && str.indexOf(goallocation) >= 0){
+                return str;
+            }
+        }
+        return "";
+    }// get the string of the line -- zhangyi and goal location exist
+    public static String WinCard(String setup,String moveSequence,char goallocation) {
+        StringBuilder sb = new StringBuilder();
+        for(int i =0;i<moveSequence.length();i++){
+            if(moveSequence.charAt(i)==goallocation){
+                char zhangyi = zhangyilocation(setup);
+                String str = getStringInLine(zhangyi,goallocation);
+                    int zhangyiIndex = str.indexOf(zhangyi);
+                    int goalIndex = str.indexOf(goallocation);
+                if(zhangyiIndex>=0&&goalIndex>=0){
+                    int f = Math.max(zhangyiIndex,goalIndex);
+                    int s = Math.min(zhangyiIndex,goalIndex)+1;
+                        for(int k=s;k<f;k++){
+                            if(getCard(setup,str.charAt(k)).charAt(0)==getCard(setup,goallocation).charAt(0)){
+                                sb.append(getCard(setup,str.charAt(k)));
+                            }// add the card in the string
+                        }
+                    }
+                    sb.append(getCard(setup,goallocation));
+                break;// the break is really important to reduce the waste of time
+            }else{
+                setup = updatePlacement(setup,zhangyilocation(setup),moveSequence.charAt(i));// update the string if there is not the goallocation
+            }
+        }
+        return sb.toString();
+        }
+
 
     /**
      * Get the list of supporters for the chosen player, given the provided
@@ -74,17 +431,41 @@
      * The list of supporters is a sequence of two-character card IDs, representing
      * the cards that the chosen player collected by moving Zhang Yi.
      *
+     *
      * @param setup        A placement string representing the board setup
      * @param moveSequence a string of location characters representing moves
      * @param numPlayers   the number of players in the game, must be in the range [2..4]
      * @param playerId     the player number for which to get the list of supporters, [0..(numPlayers-1)]
      * @return the list of supporters for the given player
      */
+    //Author- Ruiyi Sun   --
     public static String getSupporters(String setup, String moveSequence, int numPlayers, int playerId) {
         // FIXME Task 7: get the list of supporters for a given player after a sequence of moves
-        return null;
+        // distribute the sting to a list of list with the number of players
+        // use the for loop or something else to  extract the elements in each list of list with the playerId(index)
+        // combine elements and return a string
+        // transfer the string to a 2-char-string(a-g,0-7)
+        StringBuilder supporter = new StringBuilder();
+            if(moveSequence.length()%numPlayers==0||moveSequence.length()%numPlayers<playerId+1){
+            for (int i = 0; i < (moveSequence.length()-moveSequence.length()%numPlayers) / numPlayers; i++) {
+                supporter.append(WinCard(setup,moveSequence,moveSequence.charAt(playerId + i * numPlayers)));
+                // should get the currect card between move seq
+             }
+            }else if (moveSequence.length()%numPlayers>=playerId+1){
+                for (int i = 0; i <= (moveSequence.length()-moveSequence.length()%numPlayers) / numPlayers; i++) {
+                    supporter.append(WinCard(setup,moveSequence,moveSequence.charAt(playerId + i * numPlayers)));
+                }// get the correct card
+            }
+        return supporter.toString();
     }
-
+    private static String getCard(String setup,char s ){
+        for(int j = 2; j<setup.length();j = j+3){
+            if(setup.charAt(j)==s){
+                return setup.substring(j-2,j);
+            }
+        }
+        return "  ";
+    }// get the first and second char in a card
     /**
      * Given a setup and move sequence, determine which player controls the flag of each kingdom
      * after all the moves in the sequence have been played.
@@ -102,11 +483,70 @@
      * - element 6 contains the player ID of the player who controls the flag of Yan
      * If no player controls a particular house, the element for that house will have the value -1.
      */
+    //Author- Ruiyi Sun
     public static int[] getFlags(String setup, String moveSequence, int numPlayers) {
         // FIXME Task 8: determine which player controls the flag of each kingdom after a given sequence of moves
-        return null;
-    }
+        //////reduce the loop///
 
+        // use the getSupporters function to get a string
+        // get the odd index char in the string
+        // count the same char to get the number of flag
+        // compare the flag to others and take the highest number to the list
+        // if no one has this flag, add (-1) to the list.
+        // ps: if there are the same number of flag, go back to the string of each player and get the index of the last appearance of this char
+        // then add the playerId to the list
+        int[] flag = new int[7];
+        String k = "abcdefg";// the kingdom is sequence
+        for (int a = 0; a < flag.length; a++) {
+            int j = 0;// the number of flag in per player
+            Integer[] flagOfOne = new Integer[numPlayers];
+            for (int i = 0; i < numPlayers; i++) {
+                String s = getSupporters(setup, moveSequence, numPlayers, i);
+                int l = 0;
+                for (int io =0;io<s.length();io= io+2){
+                    if(s.charAt(io)==k.charAt(a)){
+                        l ++;
+                    }
+                }// check the number one(same) of kingdom card
+                flagOfOne[i] = l;// store it in the array -- the array should be one kingdom and the numplayer length
+            }
+            int max = Collections.max(Arrays.asList(flagOfOne));
+            int[] takeSameNumber = new int[numPlayers];
+            int number = 0;
+            for (int m = 0; m < flagOfOne.length; m++) {
+                if (flagOfOne[m]==max) {
+                    j++;
+                    takeSameNumber[m]=m;
+                    number = m;
+                }else{
+                    takeSameNumber[m]=-1;
+                }
+            }
+            if(max !=0){
+                if(j>1){
+                    for(int i =moveSequence.length()-1;i>=0;i--){
+                        if(getCard(setup,moveSequence.charAt(i)).charAt(0)==k.charAt(a)){
+                            int h = (i+1)% numPlayers ; // player ID currently
+                            if(h!=0){
+                                h = h-1;
+                            }else {
+                                h = numPlayers - 1;
+                            }
+                            if(takeSameNumber[h]!=-1){
+                                flag[a] = h;
+                                break;
+                            }// the nearest card have this kingdom and should be the max number of card's player
+                        }
+                    }
+                }else{
+                    flag[a]=number;
+                }
+            }else{
+                flag[a]= -1;
+            }
+        }
+        return flag;
+    }
     /**
      * Generate a legal move, given the provided placement string.
      * A move is valid if:
@@ -121,8 +561,32 @@
      * @param placement the current placement string
      * @return a location character representing Zhang Yi's destination for the move
      */
+    //Author- Shunyu Yao
     public static char generateMove(String placement) {
         // FIXME Task 10: generate a legal move
-        return '\0';
+
+        char goallocation;
+        char result = '\0';
+//location char is in the range A-Z
+        for(goallocation = 'A';goallocation<='Z';goallocation++){
+            if(isMoveLegal(placement,goallocation)){
+                result = goallocation;
+                break;
+            }
+        }
+//location char is in the range 0-9
+        for(goallocation = '0';goallocation<='9';goallocation++){
+            if(isMoveLegal(placement,goallocation)){
+                result = goallocation;
+                break;
+            }
+        }
+
+        if(result != '\0'){
+            return result;
+        }else
+        {
+            return '\0';
+        }
     }
 }
Only in comp1110-ass2/src: gittest
Only in comp1110-ass2/tests/comp1110/ass2: TestDummy.java
Only in comp1110-ass2/tests/comp1110/ass2: TestPlacement.java
Only in comp1110-ass2/tests/comp1110/ass2: updatePlacementTest.java
Only in comp1110-ass2/tests/comp1110/ass2: WinCardTest.java
Only in comp1110-ass2: Wed16b Assignment.pptx
Only in comp1110-ass2: Wed16b Presentation.pdf
```
## Test log
```
--javac output--
----
java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.CardPlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.013

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.029

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.MoveLegalTest
---
JUnit version 4.12
.....
Time: 0.075

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.MoveSequenceValidTest
---
JUnit version 4.12
.....
Time: 0.211

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.GetSupportersTest
---
JUnit version 4.12
...
Time: 0.635

OK (3 tests)

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.GetFlagsTest
---
JUnit version 4.12
...E
Time: 2.062
There was 1 failure:
1) testComprehensive(comp1110.ass2.GetFlagsTest)
org.junit.runners.model.TestTimedOutException: test timed out after 2000 milliseconds
	at comp1110.ass2.WarringStatesGame.updatePlacement(WarringStatesGame.java:376)
	at comp1110.ass2.WarringStatesGame.WinCard(WarringStatesGame.java:421)
	at comp1110.ass2.WarringStatesGame.getSupporters(WarringStatesGame.java:451)
	at comp1110.ass2.WarringStatesGame.getFlags(WarringStatesGame.java:504)
	at comp1110.ass2.GetFlagsTest.checkFlags(GetFlagsTest.java:56)
	at comp1110.ass2.GetFlagsTest.testComprehensive(GetFlagsTest.java:30)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.lang.Thread.run(Thread.java:748)

FAILURES!!!
Tests run: 3,  Failures: 1

java -cp comp1110-ass2/src:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3179443/comp1110/comp1110-tutors/bin/../ass2/junit-4.12.jar:/usr/lib/jvm/oracle-java8-jdk-amd64/jre/lib/ext/jfxrt.jar org.junit.runner.JUnitCore comp1110.ass2.GenerateMoveTest
---
JUnit version 4.12
...
Time: 0.016

OK (3 tests)

```
