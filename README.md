# Penguin Colonies
<p>Implement a meaningful method <code>hashCode</code> in <code>Penguin</code>.
Your method should satisfy the <a rel="noopener noreferrer" href="https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Object.html#hashCode()"><code>hashCode</code> contract</a>.</p>
<p>(There is no unique or best solution here. The public test just checkes for some values whether you have changed the
inherited method.)</p>
<h4 id="penguincolonies-1">Penguin Colonies</h4>
<p>Each object from <code>PenguinColony</code> represents a penguin colony, and therefore has an attribute <code>HashSet&lt;Penguin&gt;</code>
which maintains the penguins in the colony.
In the following sub-tasks, you may assume (for simplicity) that passed arguments are not <code>null</code>,
that collections do not contain <code>null</code> objects, and that no pengiun has <code>null</code> attribute values.</p>
<p>Extend the class <code>PenguinColony</code> with implementations of the following methods:</p>
<div class="pe-task-2 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-cpl-c178=""><div _ngcontent-cpl-c178="" class="guided-tour success">
    <fa-icon _ngcontent-cpl-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-cpl-c178="" class="task-name ng-star-inserted">uniteColonies()</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p><code>void uniteColonies(PenguinColony otherColony)</code> which takes another penguin colony <code>otherColony</code>
and adds its penguins into the current colony. The penguin colony <code>otherColony</code> should, after execution of this method,
be empty.</p>
<div class="pe-task-3 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-cpl-c178=""><div _ngcontent-cpl-c178="" class="guided-tour success">
    <fa-icon _ngcontent-cpl-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-cpl-c178="" class="task-name ng-star-inserted">splitColony()</span><!---->

</div>
</jhi-programming-exercise-instructions-task-status></div>
<p><code>PenguinColony splitColony(Predicate&lt;? super Penguin&gt; pred)</code>.
Thereby, all penguins which satisfy the predicate <code>pred</code>, should be removed from the given colony
and collected into a new colony which is returned as result.</p>
<div class="pe-task-4 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-cpl-c178=""><div _ngcontent-cpl-c178="" class="guided-tour success">
    <fa-icon _ngcontent-cpl-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-cpl-c178="" class="task-name ng-star-inserted">findFirstFriend()</span><!---->

</div>
</jhi-programming-exercise-instructions-task-status></div>
<p><code>Penguin findFirstFriend(LinkedList&lt;Penguin&gt; penguinFriends)</code> which returns the first penguin
from the list <code>penguinFriends</code> which dwells in the colony.
The method should neither modify the colony nor the list
<code>penguinFriends</code>.</p>
<div class="pe-task-5 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-cpl-c178=""><div _ngcontent-cpl-c178="" class="guided-tour success">
    <fa-icon _ngcontent-cpl-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-cpl-c178="" class="task-name ng-star-inserted">canFeedPenguinsWithProperty()</span><!---->

</div>
</jhi-programming-exercise-instructions-task-status></div>
<p><code>boolean canFeedPenguinsWithProperty(Predicate&lt;? super Penguin&gt; pred, Set&lt;Fish&gt; fishes)</code> which returns
<code>true</code> if for every penguin in the colony satisfying the predicate <code>pred</code>, the favorite fish is contained
in the set <code>fishes</code>.
Otherwise, <code>false</code> should be returned. (Thereby, it should be irrelevant whether only one or many penguins
prefer the same kind of fish: there is always enough supply of every kind of fish in the set).</p>
<div class="pe-task-6 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-cpl-c178=""><div _ngcontent-cpl-c178="" class="guided-tour success">
    <fa-icon _ngcontent-cpl-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-cpl-c178="" class="task-name ng-star-inserted">computeSum()</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p><code>int computeSum(Function&lt;? super Penguin, Integer&gt; fun)</code> which applies the function represented by
<code>fun</code>, to all penguins of the colony returns the sum of the computed values.</p>
<p><a rel="noopener noreferrer" href="https://bitbucket.ase.in.tum.de/projects/KIU20W9COLONY/repos/kiu20w9colony-solution/browse">Suggested solution</a></p></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions><!---->
